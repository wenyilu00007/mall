package com.wyl.mall.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.Collection;

/**
* @Title RestBeanUtils 
* @Package com.wyl.mall.util
* @Description 重置Bean中某些值
* @author 陈宇霖  
* @date 2018/1/22 14:08
* @version V1.0   
*/
public class RestBeanUtils {

    /**
     * 格式化对象中的BigDecimal数据未小数点后两位
     * @param originData
     * @return
     * @author 陈宇霖
     * @date 2018年01月22日14:35:28
     */
    public static Object formatNumber(Object originData) {
        if (originData != null) {
            PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(originData.getClass());
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                Method readMethod = propertyDescriptor.getReadMethod();
                try {
                    if (readMethod != null) {
                        if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
                            readMethod.setAccessible(true);
                        }
                        Object value = readMethod.invoke(originData);
                        if (value != null) {
                            if (value instanceof BigDecimal) {
                                value = ((BigDecimal) value).setScale(2, BigDecimal.ROUND_HALF_UP);
                            }
                            if (value instanceof Collection) {
                                for (Object o : ((Collection) value)) {
                                    o = formatNumber(o);
                                }
                            }
                            Method writeMethod = propertyDescriptor.getWriteMethod();
                            if (writeMethod != null) {
                                if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
                                    writeMethod.setAccessible(true);
                                }
                                writeMethod.invoke(originData, value);
                            }
                        }
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
        return originData;
    }

    /**
     * 将对象中的空字符串设置为null
     * @param originData
     * @return
     * @author 陈宇霖
     * @date 2018年01月22日14:54:58
     */
    public static Object formatString(Object originData) {
        if (originData != null) {
            PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(originData.getClass());
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                Method readMethod = propertyDescriptor.getReadMethod();
                try {
                    if (readMethod != null) {
                        if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
                            readMethod.setAccessible(true);
                        }
                        Object value = readMethod.invoke(originData);
                        if (value != null) {
                            if (value instanceof String && StringUtils.isEmpty((String) value)) {
                                value = null;
                            }
                            if (value instanceof Collection) {
                                for (Object o : ((Collection) value)) {
                                    o = formatString(o);
                                }
                            }
                            Method writeMethod = propertyDescriptor.getWriteMethod();
                            if (writeMethod != null) {
                                if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
                                    writeMethod.setAccessible(true);
                                }
                                writeMethod.invoke(originData, value);
                            }
                        }
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
        return originData;
    }

}
