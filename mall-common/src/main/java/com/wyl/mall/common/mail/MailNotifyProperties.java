package com.wyl.mall.common.mail;
/**   
* @Title MailNotifyProperties 
* @Package com.wyl.mall.common.mail
* @Description 邮件通知配置
* @author 陈宇霖  
* @date 2017/11/29 16:20
* @version V1.0   
*/
public class MailNotifyProperties {

    /**
     * 收件人
     */
    private String[] to;

    /**
     * 抄送
     */
    private String[] cc;

    /**
     * 邮件模板名称
     */
    private String templateName;

    /**
     * 优先级
     */
    private int priority;

    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }

    public String[] getCc() {
        return cc;
    }

    public void setCc(String[] cc) {
        this.cc = cc;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
