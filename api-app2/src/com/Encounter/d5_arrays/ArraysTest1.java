package com.Encounter.d5_arrays;

/**
 * @author Encounter
 * @date 2024/6/22 9:40
 */

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/**
 * 掌握Arrays类的常用方法
 * 1.public static String toString(类型[] arr):返回数组内容
 * 2.public static int[] copyOfRange(类型[] arr,起始索引,结束索引)：拷贝数组，指定范围，包前不包后
 * 3.public static copyOf(类型[] arr,int newLength):拷贝数组，可以指定新数组的长度
 * 4.public static setAll(double array,IntToDoubleFunction generator):把数组中的原数据改为新数据又存进去
 * 5.public static void sort(类型[] arr):对数组进行排序（默认是升序排序）
 */
public class ArraysTest1
    {
        public static void main(String[] args)
            {
                //1.public static String toString(类型[] arr):返回数组内容
                int[] arr = new int[]{11, 22, 33};
                System.out.println(Arrays.toString(arr));

                //2.public static int[] copyOfRange(类型[] arr,起始索引,结束索引)：拷贝数组，指定范围，包前不包后
                int[] arr2 = Arrays.copyOfRange(arr, 1, 2);
                System.out.println(Arrays.toString(arr2));

                //3.public static copyOf(类型[] arr,int newLength):拷贝数组，可以指定新数组的长度
                int[] arr3 = Arrays.copyOf(arr, 10);
                System.out.println(Arrays.toString(arr3));

                //4.public static setAll(double array,IntToDoubleFunction generator):把数组中的原数据改为新数据又存进去
                double[] d = new double[]{16.0, 12.3, 11.5};
                Arrays.setAll(d, new IntToDoubleFunction()
                    {
                        @Override
                        public double applyAsDouble(int value)
                            {
                                return d[value] * 0.8;
                            }
                    });
                System.out.println(Arrays.toString(d));

                //5.public static void sort(类型[] arr):对数组进行排序（默认是升序排序）
                Arrays.sort(d);
                System.out.println(Arrays.toString(d));

            }
    }
