package com.wyl.mall.util;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.support.converter.AbstractMessageConverter;
import org.springframework.amqp.support.converter.MessageConversionException;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author 陈宇霖
 * @version V1.0
 * @Title FastJsonMessageConverter
 * @Package com.wyl.mall.util
 * @Description MQ消息转换器
 * @date 2017/11/11 01:20
 */
public class FastJsonMessageConverter extends AbstractMessageConverter {

    private static Logger log = LoggerFactory.getLogger(FastJsonMessageConverter.class);
    public static final String DEFAULT_CHARSET = "UTF-8";
    private volatile String defaultCharset = DEFAULT_CHARSET;

    public static final String AQUARIUS_CONVERT_MESSAGE_OBJECT_CLASS_HEADER_NAME = "aquarius.header.name.of.convert.message.object.class";

    public FastJsonMessageConverter() {
        super();
    }

    public void setDefaultCharset(String defaultCharset) {
        this.defaultCharset = (defaultCharset != null) ? defaultCharset : DEFAULT_CHARSET;
    }

    /**
     * 将消息转换成对象，需要从MessageProperties的头信息中获取原对象类信息
     *
     * @param message
     * @return
     * @throws MessageConversionException
     * @author 陈宇霖
     * @date 2017年11月11日01:59:26
     */
    @Override
    public Object fromMessage(Message message) throws MessageConversionException {
        String json = "";
        try {
            json = new String(message.getBody(), defaultCharset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Object classType = message.getMessageProperties().getHeaders().get(AQUARIUS_CONVERT_MESSAGE_OBJECT_CLASS_HEADER_NAME);
        if (classType == null || !(classType instanceof Type)) {
            throw new MessageConversionException(
                    "Failed to convert Message content, Lost Original Object Class Type");
        }
        return JSON.parseObject(json, (Type) classType);
    }

    /**
     * 使用fastjson将消息对象转换成JSON字符串进行传输
     *
     * @param object            the payload
     * @param messageProperties the message properties (headers)
     * @return a message
     */
    @Override
    protected Message createMessage(Object object, MessageProperties messageProperties)
            throws MessageConversionException {
        byte[] bytes;
        try {
            String jsonString = JSON.toJSONString(object);
            bytes = jsonString.getBytes(this.defaultCharset);
        } catch (UnsupportedEncodingException e) {
            throw new MessageConversionException(
                    "Failed to convert Message content", e);
        }
        Type clazz = object.getClass();
        try {
            clazz = ((ParameterizedType) object.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
        messageProperties.getHeaders().put(AQUARIUS_CONVERT_MESSAGE_OBJECT_CLASS_HEADER_NAME, clazz);
        messageProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);
        messageProperties.setContentEncoding(this.defaultCharset);
        if (bytes != null) {
            messageProperties.setContentLength(bytes.length);
        }
        return new Message(bytes, messageProperties);
    }

}
