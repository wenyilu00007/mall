package com.wyl.mall.permission.dto;

import com.wyl.zodiac.core.entity.IUser;

import java.util.Date;

/**
* @Title: User 
* @Package com.hoau.leo.business.domain 
* @Description: 用户信息
* @author 陈宇霖  
* @date 2017/8/3 17:32
* @version V1.0   
*/
public class UserDTO implements IUser {

    private static final long serialVersionUID = 4450758489889109392L;
    /**
     * 主键
     */
    private String id;

    /**
     * 用户登录名
     */
    private String userCode;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 用户生效时间
     */
    private Date enableTime;

    /**
     * 用户失效时间
     */
    private Date disableTime;

    /**
     * 用户最后登录时间
     */
    private Date lastLoginTime;

    /**
     * 版本控制号
     */
    private Long versionNo;

    /**
     * 用户是否可用，0：不可以，1：可用
     */
    private Integer active;

    /**
     * 中文姓名
     */
    private String userChineseName;

    /**
     * 中文名全拼
     */
    private String userChineseSpell;

    /**
     * 中文名首字母
     */
    private String userChineseShortSpell;

    /**
     * 英文名
     */
    private String userEnglishName;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 电话
     */
    private String phone;

    /**
     * 备注
     */
    private String remark;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createUserCode;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private String modifyUserCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    public Date getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(Date disableTime) {
        this.disableTime = disableTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getUserChineseName() {
        return userChineseName;
    }

    public void setUserChineseName(String userChineseName) {
        this.userChineseName = userChineseName;
    }

    public String getUserChineseSpell() {
        return userChineseSpell;
    }

    public void setUserChineseSpell(String userChineseSpell) {
        this.userChineseSpell = userChineseSpell;
    }

    public String getUserChineseShortSpell() {
        return userChineseShortSpell;
    }

    public void setUserChineseShortSpell(String userChineseShortSpell) {
        this.userChineseShortSpell = userChineseShortSpell;
    }

    public String getUserEnglishName() {
        return userEnglishName;
    }

    public void setUserEnglishName(String userEnglishName) {
        this.userEnglishName = userEnglishName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserCode() {
        return createUserCode;
    }

    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUserCode() {
        return modifyUserCode;
    }

    public void setModifyUserCode(String modifyUserCode) {
        this.modifyUserCode = modifyUserCode;
    }
}
