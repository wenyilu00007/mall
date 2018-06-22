package com.wyl.mall.util;

import com.wyl.zodiac.core.util.string.StringUtils;

import java.util.Date;

/**
* @Title: TrackingNumberUtils
* @Package com.wyl.zodiac.core.util
* @Description: 物流单号校验
* @author 陈宇霖  
* @date 2017/10/14 11:01
* @version V1.0   
*/
public class TrackingNumberUtils {

    private static final int[] weights = {9,7,5,3,1,8,6,4,2};

    private static final int begin = 4;

    private static final int digit = 9;

    private static final int weightAvg = 9;

    private static final int verifyNum = 8;

    /**
     * 获取物流单号中流水号序号
     * @param trackingNumber
     * @return
     * @author 陈宇霖
     * @date 2017年11月05日22:59:10
     */
    public static String getTrackingNumberSequence(String trackingNumber) {
        //流水号为第3-14位
        return trackingNumber.substring(2, 14);
    }

    /**
     * 校验物流单校验位是否合法
     * @param trackingNumber
     * @return
     * @author 陈宇霖
     * @date 2017年10月14日11:25:38
     */
    public static boolean verifyTrackingNumber(String trackingNumber) {
        //物流单总长度28位
        if (StringUtils.isBlank(trackingNumber) || trackingNumber.length() != 28) {
            return false;
        }
        //校验位检查
        //流水号为第3-14位
        String flowNum = trackingNumber.substring(2, 14);
        if (!StringUtils.isNumeric(flowNum)) {
            return false;
        }
        String serverVerifyFlag = verifyCodeGenerate(flowNum);
        //校验位为第15位
        String verifyFlag = trackingNumber.substring(14, 15);
        if (!serverVerifyFlag.equals(verifyFlag)) {
            return false;
        }
        return true;
    }

    /**
     * 校验数字生成规则：
     * 1、将运单编号4-12位置的每个数字与相关的权重数字相乘；
     * 2、各项相乘结果加和；
     * 3、把总数除以9，获取余数；
     * 4、余数+8，所得之和的个位数为验证数字。
     * @param flowNum 12位流水号
     * @return
     */
    public static String verifyCodeGenerate(String flowNum){
        String verifyCode = null;
        int sum = 0 ;
        for(int i = 0 ; i < digit ; i++){
            sum = sum + Integer.parseInt(""+flowNum.charAt( i+ begin -1 )) * weights[i];
        }
        verifyCode = "" + (sum % weightAvg + verifyNum) % 10 ;
        return verifyCode;
    }


    public static void main(String[] args) {
        String trackNumber = "2012345678901210000000000";
        int index = 15;
        for (long i = 103004179079l + index * 10000; i < 103004179079l + (index + 1) * 10000; i ++ ) {
            System.out.println("EX" + i + verifyCodeGenerate(String.valueOf(i)) + "0000000000000");
        }
//        String serial = "103003179079";//String.valueOf(new Date().getTime()).substring(1);
//        System.out.println("EX" + serial + verifyCodeGenerate(serial) + "0000000000000");
    }
}
