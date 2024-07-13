package com.Encounter.d0_demo.Test3_1.sort;

import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/6/22 17:00
 */

/**
 * 使用Arrays.sort方法，对一个字符串数组进行升序排序，要求忽略首字符大小写排序，请特定类型的方法引用简化lambda写法
 */
public class Test
    {
        public static void main(String[] args)
            {
                String[] str = {"ABC", "b", "as", "vfcv", "dfghj"};
                Arrays.sort(str, (o1, o2) -> o1.compareToIgnoreCase(o2));
                //Arrays.sort(str, String::compareToIgnoreCase);

                System.out.println(Arrays.toString(str));
            }
    }
