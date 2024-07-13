package com.Encounter.d13_stringBuilder;

/**
 * @author Encounter
 * @date 2024/6/21 10:11
 */
public class Test3
    {
        public static void main(String[] args)
            {
                int[] arr = new int[]{11, 22, 33};
                System.out.println(getArrayData(arr));
            }

        public static String getArrayData(int[] arr)
            {
                //判断是否为null
                if (arr == null)
                    return null;
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (int i = 0; i < arr.length; i++)
                    {
                        sb = (i != arr.length - 1) ? sb.append(arr[i]).append(",") : sb.append(arr[i]);
                    }
                sb.append("]");
                return sb.toString();
            }
    }
