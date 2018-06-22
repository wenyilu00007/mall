package com.wyl.mall.permission.dto;

import com.wyl.zodiac.core.entity.IResource;

import java.util.Date;
import java.util.List;

/**
* @Title: ResourceDTO 
* @Package com.hoau.cancer.permission.dto 
* @Description: 与权限系统交互的实体
* @author 陈宇霖  
* @date 2017/9/18 18:21
* @version V1.0   
*/
public class ResourceDTO implements IResource {

    private static final long serialVersionUID = -1034557484044565664L;
    /**
     * 主键
     */
    private String id;

    /**
     * 功能编码
     */
    private String resourceCode;

    /**
     * 功能名称
     */
    private String resourceName;

    /**
     * 功能层次
     */
    private Integer resourceLevel;

    /**
     * 功能入口URI
     */
    private String entryUri;

    /**
     * 菜单对应组件路径
     */
    private String componentPath;

    /**
     * 父功能
     */
    private String parentCode;

    /**
     * 显示顺序
     */
    private Integer displayOrder;

    /**
     * 是否权限检查
     */
    private Integer checkPermission;

    /**
     * 功能类型
     */
    private Integer resourceType;

    /**
     * 是否叶子节点
     */
    private Integer leaf;

    /**
     * 所属系统类型
     */
    private String belongSystem;

    /**
     * 数据版本号
     */
    private Long versionNo;

    /**
     * 是否有效
     */
    private Integer active;

    /**
     * 图标路径
     */
    private String icon;

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

    /**
     * 多语言对应本地化的权限名称
     */
    private List<LocaleResourceName> localeResourceNames;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Integer getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(Integer resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public String getEntryUri() {
        return entryUri;
    }

    public void setEntryUri(String entryUri) {
        this.entryUri = entryUri;
    }

    public String getComponentPath() {
        return componentPath;
    }

    public void setComponentPath(String componentPath) {
        this.componentPath = componentPath;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getCheckPermission() {
        return checkPermission;
    }

    public void setCheckPermission(Integer checkPermission) {
        this.checkPermission = checkPermission;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getLeaf() {
        return leaf;
    }

    public void setLeaf(Integer leaf) {
        this.leaf = leaf;
    }

    public String getBelongSystem() {
        return belongSystem;
    }

    public void setBelongSystem(String belongSystem) {
        this.belongSystem = belongSystem;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public List<LocaleResourceName> getLocaleResourceNames() {
        return localeResourceNames;
    }

    public void setLocaleResourceNames(List<LocaleResourceName> localeResourceNames) {
        this.localeResourceNames = localeResourceNames;
    }

    /**
     * 本地化的权限名称
     */
    public class LocaleResourceName {

        /**
         * 语言
         */
        private String language;

        /**
         * 指定语言对应的个权限名称
         */
        private String resourceName;

        public LocaleResourceName() {

        }
        public LocaleResourceName(String language, String resourceName) {
            this.language = language;
            this.resourceName = resourceName;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }
    }
}
