package com.Encounter.d0_demo.Test2_5;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/22 10:30
 */

/**
 * 定义一个类，实现以下操作
 * ①定义一个长度为10的整数数组，使用随机数对数组进行初始化。随机数范围是1-100
 * ②)使用Arrays类的sort方法进行升序排序，并输出排序后的结果。
 * ③接着使用Arrays类的binarySearch方法，
 * 查找数组中值为5的元素，并输出其在数组中的位置。
 * 提示:可以使用Random类生成随机数。
 */
public class Test1
    {
        public static void main(String[] args)
            {
                int[] arr = new int[10];
                Random r = new Random();
                for (int i = 0; i < arr.length; i++)
                    {
                        arr[i] = r.nextInt(100) + 1;
                    }
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
                System.out.println(Arrays.binarySearch(arr, 5));
            }
    }
