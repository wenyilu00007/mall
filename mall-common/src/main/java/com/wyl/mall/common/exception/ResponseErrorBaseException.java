package com.wyl.mall.common.exception;

import com.wyl.zodiac.core.exception.BusinessException;

/**
 * @version 1.0
 * @title  ResponseErrorBaseException
 * @package com.wyl.mall.common.exception
 * @description 
 * @author DINGYONG
 * @date 2017/11/8
 */
public class ResponseErrorBaseException extends BusinessException {

    private static final long serialVersionUID = -170136798372435166L;

    /**
     * 接口调用成功
     */
    public static final String INVOKE_SUCCESS_SEQ = "0";
    public static final String INVOKE_SUCCESS_MSG = "invoke.success.msg";

    /**
     * 方法调用错误
     */
    public static final String METHOD_NOT_SUPPORTED_ERROR_SEQ = "2";
    public static final String  METHOD_NOT_SUPPORTED_ERROR_MSG = "method.not.supported.error";
    /**
     * 接口参数错误，请联系管理员
     */
    public static final String INVOKE_SYSTEM_ERROR_SEQ = "3";
    public static final String INVOKE_SYSTEM_ERROR_MSG = "invoke.system.error";
    /**
     * 全部数据失败
     */
    public static final String ALL_DATA_FAILED_ERROR_SEQ = "4";
    public static final String  ALL_DATA_FAILED_ERROR_MSG = "all.data.failed";
    /**
     *  部分数据失败
     */
    public static final String PARTIAL_DATA_FAILED_ERROR_SEQ = "5";
    public static final String  PARTIAL_DATA_FAILED_ERROR_MSG = "partial.data.failed";

}
