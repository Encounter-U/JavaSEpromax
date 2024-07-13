package com.Encounter.d0_demo.Test2_2;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/21 11:52
 */

/**
 * 请使用StringBuilder类、Stringjoiner类、Math类、BigDecimal类中的常用方法实现以下功能:
 * ①输入两个数，分别用BigDecimal表示
 * ②)计算它们的乘积并对结果进行四舍五入
 * ③最后用StringBuilder将结果输出为如下格式的字符串:"数字1与数字2的乘积为XXX'
 * 其中，数字1、数字2和XXX分别为对应的数值。
 * 提示:使用Math中的round方法对结果进行四舍五入，使用BigDecimal的multiply方法计算乘积，使用StringBuilder的append方法进行字符串
 * 拼接。
 */
public class Compute
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入第一个数：");
                BigDecimal first = BigDecimal.valueOf(sc.nextDouble());
                System.out.print("输入第二个数：");
                BigDecimal second = BigDecimal.valueOf(sc.nextDouble());
                long result = Math.round(first.multiply(second).doubleValue());
                StringBuilder sb = new StringBuilder();
                System.out.println(sb.append(first).append("与").append(second).append("的乘积为").append(result));
            }
    }
