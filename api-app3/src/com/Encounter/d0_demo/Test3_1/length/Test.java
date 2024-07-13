package com.Encounter.d0_demo.Test3_1.length;

import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/6/22 16:50
 */

/**
 * 使用Arrays.sort方法，对一个字符串数组进行排序，要求按照字符串长度从小到大排序。分别用下面两种方式实现
 * ①使用lambda表达式实现
 * 2)编写CompareByData类,
 * ，在里面定义静态比较方法，使用静态方法引用简化lambda写法
 */
public class Test
    {
        public static void main(String[] args)
            {
                String[] str = {"ABC", "a", "as", "vfcv", "dfghj"};
                //lambda
                /*Arrays.sort(str, (o1, o2) ->
                    {
                        if (o1.length() > o2.length())
                            return 1;
                        else if (o1.length() < o2.length())
                                return -1;
                        return 0;
                    });*/

                //静态方法
                Arrays.sort(str,CompareByData::compareByLength);
                System.out.println(Arrays.toString(str));
            }
    }
