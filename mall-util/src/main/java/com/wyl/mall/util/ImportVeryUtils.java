package com.wyl.mall.util;

import com.wyl.zodiac.core.exception.BusinessException;
import com.wyl.zodiac.core.util.string.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import java.math.BigDecimal;

/**
 * @author 温奕禄
 * @version V1.0
 * @Title: ImportVeryUtils
 * @Package com.wyl.zodiac.core.util
 * @Description: 导入非空校验 等基础方法
 * @date 2017/10/14 11:01
 */
public class ImportVeryUtils {


    //截取到小数点校验，类似01.00这种格式
    public static String subEndTPoint(String param) {
        if (NumberUtils.isNumber(param) && param.indexOf(".") >= 0) {
            return param.substring(0, param.indexOf("."));
        }
        return param;
    }

    //非空且必须为数字校验
    public static void notBlanckAndIsNumVery(String param, String errorMsg) {
        if (org.apache.commons.lang.StringUtils.isBlank(param) || !NumberUtils.isNumber(param)) {
            throw new BusinessException(errorMsg);
        }
    }

    //非空校验
    public static void notBlanckVery(String param, String errorMsg) {
        if (org.apache.commons.lang.StringUtils.isBlank(param)) {
            throw new BusinessException(errorMsg);
        }
    }

    //对值进行截取
    public static String roundDownNumber(String numberTypeParam) {
        if (org.apache.commons.lang.StringUtils.isNotBlank(numberTypeParam) && NumberUtils.isNumber(numberTypeParam)) {
            return new BigDecimal(numberTypeParam).setScale(0, BigDecimal.ROUND_DOWN).toPlainString();
        }
        return numberTypeParam;
    }

}
