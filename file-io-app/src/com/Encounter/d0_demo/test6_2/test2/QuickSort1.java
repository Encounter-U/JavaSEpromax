package com.Encounter.d0_demo.test6_2.test2;

import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/7/1 16:55
 */

/**
 * 素，一部分大于等于基准元素，然后对这两个子数组分别递归地进行排序。
 * 请在网上了解一下快速排序，编写一个程序实现该功能
 * 快速排序 (Quick Sort)是一种基于分治思想的排序算法。它的基本思想是选择一个基准元素，将数组分成两个子数组，一部分小于等于基准元
 */
public class QuickSort1
    {
    public static void main(String[] args) {
        int[] arr = {99, 55, 2, 3, 9, 10, 22, 34, 67, 89, 69, 92, 101, 102};
        //int[] arr = {20, 3, 9, 10, 22};
        //定义队首位置的索引
        int left = 0;
        //定义队尾位置的索引
        int right = arr.length - 1;
        sort(arr, left, right);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            //定义基准数
            int pivot = arr[left];
            //记录序列的开始
            int begin = left;
            //记录序列的结束
            int end = right;

            while (right > left) {
                //当队尾元素小于基准数就将队尾插到队首
                if (arr[right] < pivot) {
                    arr[left] = arr[right];
                    //并将队首索引后移
                    left++;
                } else {
                    //当队尾元素大于基准数就将队尾索引前移
                    //并继续从队尾比较
                    right--;
                    continue;
                }
                while (right > left) {
                    //当队首元素大于基准数就将队首位置插到队尾
                    if (arr[left] > pivot) {
                        arr[right] = arr[left];
                        //并将队尾索引前移
                        right--;
                        break;
                    } else {
                        //当队首元素小于基准数就将队首索引前移
                        //并继续从队首比较
                        left++;
                    }
                }
            }
            //队首和队尾索引重合，就将基准数插入此位置
            arr[left] = pivot;

            sort(arr, begin, left - 1);
            sort(arr, left + 1, end);
        }
    }
}
