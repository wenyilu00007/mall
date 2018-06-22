package com.wyl.mall.util.constant;

/**
 * @version V1.0
 * @Title: VendorMessageConstants
 * @Package: com.wyl.mall.util.constant
 * @Description: 用于定义供应商信息里后台返回前台的消息模板KEY
 * @author: dengyin
 * @date: 17-11-11
 */
public class VendorMessageConstants {

    /**
     * 已存在相同的供应商编号
     */
    public static final String VENDOR_BASIC_EXISTES_SAME_CODE = "vendor.basic.exists.same.code";

    /**
     * 不存在对应的供应商基础信息
     */
    public static final String VENDOR_BASIC_NO_EXISTS= "vendor.basic.no.exists";


    /**
     * 对应的供应商基础信息已停用
     */
    public static final String VENDOR_BASIC_IS_DISABLED = "vendor.basic.is.disabled";

    /**
     * 已存在相同的账号编码
     */
    public static final String VENDOR_BASIC_EXISTES_SAME_ACCOUNT_CODE = "vendor.basic.exists.same.account.code";

    /**
     * 已存在相同的账号编码
     */
    public static final String VENDOR_BASIC_EXISTES_SAME_ACCOUNT_ENCODE = "vendor.basic.exists.same.account.encode";

    /**
     * 供应商存在关联：子账号、子流程、启用的站点、CC、RDC、ASH、路由,不能停用
     */
    public static final String VENDOR_REL_ACCOUNT_SUBFLOW_CC_RDC_ASH_ROUTE = "vendor.rel.account.subflow.cc.rdc.ash.route";
}
