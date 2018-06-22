package com.wyl.mall.util.constant;
/**   
* @Title: MessageConstants 
* @Package com.hoau.leo.util.constant
* @Description: 消息国际化常量
* @author 陈宇霖  
* @date 2017年08月13日16:01:37
* @version V1.0   
*/
public class MessageConstants {

    /**
     * 新增成功国际化提示消息key
     */
    public static final String COMMON_ADD_SUCCESS_MESSAGE = "common.add.success";

    /**
     * 修改成功国际化提示消息key
     */
    public static final String COMMON_UPDATE_SUCCESS_MESSAGE = "common.update.success";

    /**
     * 删除成功国际化提示消息key
     */
    public static final String COMMON_DELETE_SUCCESS_MESSAGE = "common.delete.success";

    /**
     * 登录成功国际化提示消息key
     */
    public static final String COMMON_LOGIN_SUCCESS_MESSAGE = "common.login.success";
    /**
     * 发布成功国际化提示消息key
     */
    public static final String COMMON_RELEASE_SUCCESS_MESSAGE = "common.release.success";

    /**
     * 编码已经存在国际化提示消息key
     */
    public static final String COMMON_ADD_CONFLICT = "common.add.conflict";
    /**
     * 编码已经存在国际化提示消息key
     */
    public static final String NAME_ALREADY_EXISTS = "name.already.exists";

    /**
     * 缺少必要参数国际化提示消息key
     */
    public static final String COMMON_ADD_BADREQUEST = "common.add.badrequest";

    /**
     * 申请成功
     */
    public static final String COMMON_APPLY_SUCCESS_MESSAGE = "common.apply.success";


    /**
     * 修改对象不存在国际化提示消息key
     */
    public static final String COMMON_UPDATE_TARGET_NOT_EXISTS = "common.update.target.not.exists";

    /**
     * 绑定成功国际化提示消息key
     */
    public static final String COMMON_BINDING_SUCCESS = "common.binding.success";

    public static final String COMMON_ADD_REMOTE_PROPERTIES_CONFLICT = "common_add_remote_properties_conflict";

    public static final String MUST_BE_REMOTE_FOR_DELIVERY_OR_COLLECTION = "must_be_remote_for_delivery_or_collection";

    /**
     * 启用成功国际化提示消息key
     */
    public static final String COMMON_ENABLE_SUCCESS_MESSAGE = "common.enable.success";

    /**
     * 停用用成功国际化提示消息key
     */
    public static final String COMMON_DISABLE_SUCCESS_MESSAGE = "common.disable.success" ;
    /**
     * 数据库添加失败消息key
     */
    public static final String DATABASE_ADD_FAILURE_MESSAGE = "database.add.failure";

    /**
     * 数据库查询失败
     */
    public static final String DATABASE_QUERY_FAILURE_MESSAGE = "database.query.failure";

    /**
     * 数据库修改失败
     */
    public static final String DATABASE_UPDATE_FAILURE_MESSAGE = "database.update.failure";

    /**
     * 数据库删除失败
     */
    public static final String DATABASE_DELETE_FAILURE_MESSAGE = "database.delete.failure";

    /**
     * 维护揽收范围 区县重复提示
     */
    public static final String AREA_ALREADY_EXISTS = "area.already.exists";

    /**
     * 维护揽收范围 城市重复提示
     */
    public static final String CITY_ALREADY_EXISTS = "city.already.exists";

    /**
     * 成本明细 起始金额 重复校验
     */
    public static final String START_END_VALUE_OVERLAP = "number.overlap";

    /**
     * 成本明细 起始金额 间隙校验
     */
    public static final String START_END_VALUE_GAP = "number.gap";

    /**
     * 生效 失效时间重复校验
     */
    public static final String TIME_OVERLAP = "time.overlap";

    /**
     * 校验失败
     */
    public static final String VALIDATE_FAILURE = "validate.failure";

    /**
     * 任务调用接口成功
     */
    public static final String JOB_SUCCESS = "success";
    /**
     * 收入扣费计算接口调用成功
     */
    public static final String CHARGES_CALCULATE_SUCCESS = "success";

    /**
     * 存在相同stn-cc路由
     */
    public static final String STN_CC_SAME_ROUTE = "station.cc.route.exists";
    /**
     * 存在相同stn-cc路由
     */
    public static final String STN_CC_ELECTRIC_CONFLICT = "station.cc.electric.conflict";

    /**
     * 供应商服务类型重复
     */
    public static final String VENDOR_SERVICE_TYPE_REPEAT = "vendor.service.type.repeat";

    /**
     * 停用STN,RDC...时 提示: 此记录存在有效的成本时效数据,无法停用
     */
    public static final String DISABLE_VALID_COSTTIMES_MESSAGE = "record.effective.cost.times";

}
