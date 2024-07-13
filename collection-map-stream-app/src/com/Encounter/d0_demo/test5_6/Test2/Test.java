package com.Encounter.d0_demo.test5_6.Test2;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/29 14:20
 */

/**
 * 编写一个测试类，实现以下功能
 * ①随机生成10个10至20之间的随机数(数字允许重复),并将每个数字打印到控制台
 * ②)使用Stream流的技术,找出大于15的元素并打印出来;
 */
public class Test
    {
        public static void main(String[] args)
            {
                Random r = new Random();
                int[] num = new int[10];
                for (int i = 0; i < num.length; i++)
                    {
                        num[i] = r.nextInt(11) + 10;
                        System.out.println((i+1)+":"+num[i]);
                    }
                System.out.println("==========");
                Arrays.stream(num).filter(s -> s > 15).forEach(System.out::println);
            }
    }
