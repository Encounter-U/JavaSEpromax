package com.Encounter.d0_demo.Test2_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/21 13:29
 */

/**
 * 设计一个小程序，根据用户输入的身高体重，计算出BM!指数，并根据BMI指数输出相应的健康建议。最后使用StringBuilder将结果输出为如下格
 * 式的字符串:
 * "您的身高为XXX m，体重为XXX kg，BMI指数为XXX，健康建议为XXX。
 * 其中，XXX为对应的数值和文字描述。
 * 提示:使用BigDecimal的divide方法计算BMI指数，使用compareTo方法进行BMI指数比较，BMI指数保留1位小数及四舍五入，使用Stingpuild
 * er的append方法进行字符串拼接，根据BMI指数输出相应的信息。并给出测试代码
 */
public class BMI
    {
        public static void main(String[] args)
            {
                StringBuilder sb=new StringBuilder();
                Scanner sc=new Scanner(System.in);
                System.out.print("输入身高(m)：");
                BigDecimal height = BigDecimal.valueOf(sc.nextDouble());
                System.out.print("输入体重(kg)：");
                BigDecimal weight = BigDecimal.valueOf(sc.nextDouble());
                //计算BMI
                BigDecimal BMI =weight.divide(height.multiply(height),1,RoundingMode.HALF_UP);
                //拼接字符串
                sb.append("您的身高为").append(height).append("，体重为").append(weight).append("，BMI指数为").append(BMI).append("，健康建议为");
                //判断大小，小于返回-1，相等返回0，大于返回1
                if (BMI.compareTo(BigDecimal.valueOf(18.5))<=0)
                    sb.append("多吃");
                else if (BMI.compareTo(BigDecimal.valueOf(18.5))>0&&BMI.compareTo(BigDecimal.valueOf(24))<=0)
                    sb.append("正常饮食就行");
                else if (BMI.compareTo(BigDecimal.valueOf(24))>0&&BMI.compareTo(BigDecimal.valueOf(28))<=0)
                    sb.append("注意饮食");
                else
                    sb.append("急需锻炼");
                System.out.println(sb);
            }
    }
