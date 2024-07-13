package com.Encounter.d1_algorithm;

/**
 * @author Encounter
 * @date 2024/6/22 17:11
 */

import java.util.Arrays;

/**
 * 掌握二分查找
 */
public class Test3
    {
        public static void main(String[] args)
            {
                //1.准备好一个数组
                int[] arr = {7, 12, 52, 63, 74, 110, 130, 147};

                System.out.println(binarySearch(arr, 110));
                System.out.println(Arrays.binarySearch(arr, 110));
            }

        public static int binarySearch(int[] arr, int data)
            {
                //1.定义两个变量，分别在左右
                int left = 0;
                int right = arr.length - 1;

                //2.定义一个循环控制折半
                while (left <= right)
                    {
                        //3.每次折半都算出中间位置处的索引
                        int middle = (left + right) / 2;
                        //4.判断当前要找的元素值与中间位置处的元素值的大小比较
                        if (data < arr[middle])
                            {
                                //往左边找，截止位置（右边位置）=中间位置-1
                                right = middle - 1;
                            }
                        else if (data > arr[middle])
                            {
                                left = middle + 1;
                            }
                        else
                            //中间位置处的元素值等于要找的元素值
                            return middle;
                    }
                //特殊结果，数组不不存在该数据
                return -1;
            }

    }
