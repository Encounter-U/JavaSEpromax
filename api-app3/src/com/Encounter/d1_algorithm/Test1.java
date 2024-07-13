package com.Encounter.d1_algorithm;

/**
 * @author Encounter
 * @date 2024/6/22 12:30
 */

import java.util.Arrays;

/**
 * 掌握冒泡排序的编写
 */
public class Test1
    {
        public static void main(String[] args)
            {
                //1.准备一个数组
                int[] arr = {5, 2, 3, 1};

                //2.定义循环控制排几轮
                for (int i = 0; i < arr.length - 1; i++)
                    {
                        //3.定义循环控制每轮比较几次
                        for (int j = 0; j < (arr.length - i - 1); j++)
                            {
                                if (arr[j] > arr[j + 1])
                                    {
                                        int temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                    }
                            }
                    }
                System.out.println(Arrays.toString(arr));
            }
    }
