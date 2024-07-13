package com.Encounter.d14_stringJoiner;

/**
 * @author Encounter
 * @date 2024/6/21 10:22
 */

import java.util.StringJoiner;

/**
 * 掌握StringJoiner的使用
 */
public class Test
    {
        public static void main(String[] args)
            {
                //StringJoiner sj=new StringJoiner(",");
                StringJoiner sj=new StringJoiner(",","[","]");
                sj.add("Java1");
                sj.add("Java2");
                sj.add("Java3");
                System.out.println(sj);

                int[] arr = new int[]{11, 22, 33};
                System.out.println(getArrayData(arr));
            }

        public static String getArrayData(int[] arr)
            {
                //判断是否为null
                if (arr == null)
                    return null;
                StringJoiner sj = new StringJoiner(",","[","]");
                for (int i = 0; i < arr.length; i++)
                    {
                        sj.add(arr[i]+"");//转为字符串
                    }
                return sj.toString();
            }
    }
