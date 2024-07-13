package com.Encounter.d13_stringBuilder;

/**
 * @author Encounter
 * @date 2024/6/21 10:03
 */

/**
 * 掌握StringBuilder的好处
 */
public class Test2
    {
        public static void main(String[] args)
            {
                /*
                需求：拼接100w次abc
                先用String测试性能
                 */
                /*String s="";
                for (int i = 0; i < 1000000; i++)
                    {
                        s+="abc";
                    }
                System.out.println(s);*/
                StringBuilder sb=new StringBuilder();
                for (int i = 0; i < 1000000; i++)
                    {
                        sb.append("abc");
                    }
                System.out.println(sb);
            }
    }
