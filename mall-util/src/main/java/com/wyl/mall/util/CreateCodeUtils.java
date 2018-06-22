package com.wyl.mall.util;

import org.apache.commons.lang.StringUtils;

import java.text.DecimalFormat;

/**
 * @author 徐龙
 * @version V1.0
 * @Title: CreateCodeUtils
 * @Package com.wyl.mall.util
 * @Description: 生成编码工具类
 * @date 2017/9/23 12:05
 */
public class CreateCodeUtils {

    /**
     * 规则: 路由前缀名 +  6位自增序列
     * @param prefix
     * @param number
     * @return
     */
    public static String getCode(String prefix,  String number) {
        if(StringUtils.isNotBlank(number)){
            number = new DecimalFormat("000000").format(Long.parseLong(number));
        }
        String s = prefix + number;
        return s;
    }


}
