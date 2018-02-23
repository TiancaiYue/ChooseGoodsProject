package com.shichuang.choosegoodsproject;

import java.math.BigDecimal;

/**
 * Created by zmy on 2017/10/23.
 */

public class BigDecimalUtils {

    /**
     * 保留两位小数
     *
     * @param value
     * @param point
     * @return
     */
    public static String toDecimal(double value, int point) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.toString();
    }

    /**
     * 保留两位小数
     *
     * @param value
     * @param point
     * @return
     */
    public static String toDecimal(String value, int point) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.toString();
    }

    /**
     * 保留两位小数
     *
     * @param value
     * @param point
     * @return
     */
    public static String toDecimal(float value, int point) {
        double d = Double.parseDouble(String.valueOf(value));  // 保证精度不丢失
        BigDecimal bd = new BigDecimal(d);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.toString();
    }

    /**
     * 3      * 提供精确加法计算的add方法
     * 4      * @param value1 被加数
     * 5      * @param value2 加数
     * 6      * @return 两个参数的和
     * 7
     */
    public static double add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确减法运算的sub方法
     *
     * @param value1 被减数
     * @param value2 减数
     *               1    * @return 两个参数的差
     */
    public static double sub(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确乘法运算的mul方法
     *
     * @param value1 被乘数
     * @param value2 乘数
     * @return 两个参数的积
     */
    public static double mul(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供精确的除法运算方法div
     *
     * @param value1 被除数
     * @param value2 除数
     * @param scale  精确范围
     * @return 两个参数的商
     * @throws IllegalAccessException
     */
    public static double div(double value1, double value2, int scale) throws IllegalAccessException {
        //如果精确范围小于0，抛出异常信息
        if (scale < 0) {
            throw new IllegalAccessException("精确度不能小于0");
        }
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.divide(b2, scale).doubleValue();
    }

}
