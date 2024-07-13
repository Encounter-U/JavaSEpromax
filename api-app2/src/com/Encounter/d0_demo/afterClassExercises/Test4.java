package com.Encounter.d0_demo.afterClassExercises;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/21 15:42
 */

/**
 * 某共公司产品经理要求App需要有3款主题样式，用户选择不同的主题，展示时间的格式也要有不同的风格，请
 * 编写代码实现该功能。
 * 运行结果:
 * 请选择主题:1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
 * 主题切换成功,当前时间为:2018年12月10日
 * 请选择主题:1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
 * 很抱歉，操作有误，已为您切换默认主题
 * 主题切换成功,当前时间为:2018年12月10日
 */
public class Test4
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                Date d = new Date();
                long time = d.getTime();
                System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
                int choic = sc.nextInt();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
                SimpleDateFormat sdf = new SimpleDateFormat();
                switch (choic)
                    {
                        case 1 -> sdf = sdf1;
                        case 2 -> sdf = sdf2;
                        case 3 -> sdf = sdf3;
                        default ->
                            {
                                System.out.println("很抱歉，操作有误，已为您切换默认主题");
                                sdf = sdf1;
                            }
                    }
                System.out.println("主题切换成功，当前时间为：" + sdf.format(time));
            }
    }
