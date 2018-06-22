package com.wyl.mall.permission.dto;

import com.wyl.zodiac.core.util.string.StringUtils;

import java.io.Serializable;
import java.util.*;

/**
* @Title: TreeNodeDTO 
* @Package com.hoau.leo.business.vo 
* @Description: 前台展示树形控件的数据模型
* @author 陈宇霖  
* @date 2017/8/14 09:59
* @version V1.0   
*/
public class TreeNodeDTO implements Serializable, Comparable<TreeNodeDTO> {

    private static final long serialVersionUID = -6305345579122616174L;

    /**
     * 路由路径
     */
    private String path;

    /**
     * 树节点显示名称
     */
    private String name;

    /**
     * 节点对应组件路径
     */
    private String component;

    /**
     * 是否叶子节点
     */
    private Boolean leaf;

    /**
     * 是否显示
     */
    private Boolean hidden;

    /**
     * 图标路径
     */
    private String icon;

    /**
     * 显示顺序
     */
    private Integer displayOrder;

    /**
     * 节点类型 0根节点、1模块、2菜单、3按钮
     */
    private Integer nodeType;


    //权限管理需要字段新增
    /**
     * 对应权限编码resourceCode
     */
    private  String id;

    /**
     * 页面需要使用的额外信息
     */
    private Meta meta;

    /**
     * 子节点
     */
    private List<TreeNodeDTO> children = new ArrayList<TreeNodeDTO>();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TreeNodeDTO)) {
            return false;
        }
        TreeNodeDTO other = (TreeNodeDTO)obj;
        return StringUtils.equals(this.path, other.path)
                && StringUtils.equals(this.name, other.name)
                && StringUtils.equals(this.component, other.component);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public List<TreeNodeDTO> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNodeDTO> children) {
        this.children = children;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public int compareTo(TreeNodeDTO o) {
        if (this.displayOrder == null) {
            this.displayOrder = 0;
        }
        if (o.displayOrder == null) {
            o.displayOrder = 0;
        }
        return (int)Math.signum(this.displayOrder - o.displayOrder);
    }

    /**
     * 向当前节点添加子节点，添加完成后按显示顺序排序
     * @param child
     * @author 陈宇霖
     * @date 2017年09月12日23:40:30
     */
    public void addChild(TreeNodeDTO child) {
        if (child != null) {
            this.children.add(child);
            Collections.sort(this.children);
        }
    }

    /**
     * 向当前界面添加可使用按钮对应的权限地址
     * @param accessUrl
     * @author 陈宇霖
     * @date 2017年09月12日23:41:17
     */
    public void addAvailableButton(String accessUrl) {
        if (this.meta == null) {
            this.meta = new Meta();
        }
        if (meta.getAvailableButtons() == null) {
            meta.setAvailableButtons(new HashSet<>());
        }
        meta.getAvailableButtons().add(accessUrl);
    }

    /**
     * 页面需要使用的额外信息实体
     * @author 陈宇霖
     * @date 2017年09月12日23:11:50
     */
    private class Meta {

        /**
         * 可用按钮列表，存放可用按钮的地址值
         */
        private Set<String> availableButtons;

        public Set<String> getAvailableButtons() {
            return availableButtons;
        }

        public void setAvailableButtons(Set<String> availableButtons) {
            this.availableButtons = availableButtons;
        }
    }
}
