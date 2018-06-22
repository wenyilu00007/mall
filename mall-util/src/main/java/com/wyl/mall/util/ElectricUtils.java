package com.wyl.mall.util;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Title ElectricUtils
 * @Package com.wyl.mall.util
 * @Description 带电类型工具类
 * @author 陈宇霖
 * @date 2018/1/30 12:22
 * @version V1.0
 */
public class ElectricUtils {

    /**
     * 合并带电类型
     * @param types
     * @return
     * @author 陈宇霖
     * @date 2018年01月30日14:21:41
     */
    public static Integer combineElectricTypes(Integer[] types) {
        return types == null ? null : Arrays.stream(types).mapToInt(Integer::intValue).sum();
    }

    /**
     * 拆分带电类型
     * @param electricTypes
     * @return
     * @author 陈宇霖
     * @date 2018年01月30日14:22:08
     */
    public static Integer[] splitElectricType(Integer electricTypes) {
        if (electricTypes == null) {
            return new Integer[0];
        }
        List<Integer> types = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int type = (int)Math.pow(2, i);
            if ((electricTypes & type) > 0) {
                types.add(type);
            }
        }
        return types.toArray(new Integer[types.size()]);
    }

    /**
     * 将外部的电池类型转换为内部电池类型
     * @param electricType
     * @return 非二进制字符串返回0
     * @author 陈宇霖
     * @date 2018年01月31日22:32:21
     */
    public static Integer convertFromOuterElectricType(String electricType) {
        if (StringUtils.isEmpty(electricType)) {
            return 0;
        }
        try {
            return Integer.parseInt(electricType, 2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 将内部的电池类型转换为外部的电池类型
     * @param electricType
     * @param length
     * @return
     */
    public static String convertToOuterElectricType(Integer electricType, int length) {
        if (electricType == null) {
            return null;
        }
        return String.format("%0" + length + "d", Integer.parseInt(Integer.toBinaryString(electricType)));
    }

    /**
     * 检查多选的带电类型中是否包含指定的类型
     * @param fullElectricType
     * @param checkElectricType
     * @return
     * @author 陈宇霖
     * @date 2018年01月30日14:33:42
     */
    public static boolean containsElectricType(Integer fullElectricType, Integer checkElectricType) {
        return fullElectricType == null && checkElectricType == null
                || (fullElectricType != null && checkElectricType != null
                && (fullElectricType & checkElectricType) == checkElectricType);
    }

}
