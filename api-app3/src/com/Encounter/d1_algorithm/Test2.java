package com.Encounter.d1_algorithm;

import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/6/22 16:19
 */
public class Test2
    {
        public static void main(String[] args)
            {
                //1.准备好一个数组
                int[] arr = {5, 1, 3, 2};

                //2.控制选择几轮
                for (int i = 0; i < arr.length - 1; i++)
                    {
                        //3.控制每轮选择几次
                        for (int j = i + 1; j < arr.length; j++)
                            {
                                if (arr[i] > arr[j])
                                    {
                                        int temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                    }
                            }
                    }
                System.out.println(Arrays.toString(arr));
            }
    }
