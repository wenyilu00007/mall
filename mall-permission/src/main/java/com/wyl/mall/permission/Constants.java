package com.wyl.mall.permission;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
* @Title: Constants 
* @Package com.hoau.cancer.permission 
* @Description: 与权限管理系统交互的常量
* @author 陈宇霖  
* @date 2017/9/18 18:25
* @version V1.0   
*/
public class Constants {

    /**
     * 权限管理系统服务服务名
     */
    public static final String PERMISSION_SERVICE_NAME = "leo-service";

    /**
     * 获取菜单树接口地址
     */
    public static final String PERMISSION_GET_RESOURCES_URL = "/external-resources/v1/resources";

    /**
     * 获取单个菜单接口地址
     */
    public static final String PERMISSION_GET_RESOURCE_URL = "/external-resources/v1/resource";

    /**
     * 获取用户信息接口地址
     */
    public static final String PERMISSION_GET_USER_URL = "/external-users/v1/user";

}


