package com.wyl.mall.util;

import com.wyl.zodiac.core.util.string.StringUtils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dengyin
 * @Title: SupplierCodeUtils
 * @Description: 用于生成供应商编号后6位递增的编号
 * @date: 2017-10-12
 */
public class SupplierCodeUtils {

    /**
     * 供应商编号
     * 生成规则：按V+当天年月日+6位不重复的数字递增
     */
    public static String getCode(String number) {

        String formatNumber = null;

        //000001 递增序号
        if (StringUtils.isNotBlank(number)) {
            formatNumber = new DecimalFormat("000000").format(Long.parseLong(number));
        }

        //V
        StringBuffer buffer = new StringBuffer("V");

        //20171012
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String ymd = sdf.format(new Date());
        buffer.append(ymd);

        buffer.append(formatNumber);

        return buffer.toString();
    }
}
