package com.Encounter.d13_stringBuilder;

/**
 * @author Encounter
 * @date 2024/6/21 9:56
 */

/**
 * 搞清楚StringBuilder的用法和作用
 */
public class Test1
    {
        public static void main(String[] args)
            {
                StringBuilder sb = new StringBuilder("路明非");

                //1.拼接内容
                sb.append(22);
                sb.append("会");
                sb.append("龙化");
                sb.append(true);

                //支持链式编程
                sb.append(1).append(2).append(3);

                //反转操作
                sb.reverse();
                System.out.println(sb);

                //3.返回字符串长度
                System.out.println(sb.length());

                //4.把StringBuilder转为String
                System.out.println(sb.toString());
            }
    }
