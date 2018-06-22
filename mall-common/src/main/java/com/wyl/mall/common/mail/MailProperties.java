package com.wyl.mall.common.mail;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
* @Title MailProperties 
* @Package com.wyl.mall.common.mail
* @Description 邮件相关配置
* @author 陈宇霖  
* @date 2017/11/29 16:19
* @version V1.0   
*/
@ConfigurationProperties(prefix = "aquarius.mail")
public class MailProperties {

    /**
     * 各种邮件通知列表
     */
    private Map<String, MailNotifyProperties> notifyList;

    public Map<String, MailNotifyProperties> getNotifyList() {
        return notifyList;
    }

    public void setNotifyList(Map<String, MailNotifyProperties> notifyList) {
        this.notifyList = notifyList;
    }
}
