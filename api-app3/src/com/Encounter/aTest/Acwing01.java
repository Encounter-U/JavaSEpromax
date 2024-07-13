package com.Encounter.aTest;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/9/14
 */
public class Acwing01
    {
        /**
         * 小明正在整理一批历史文献。这些历史文献中出现了很多日期。
         * 小明知道这些日期都在1960年1月1日至2059年12月31日。
         * 令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。
         * 更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。
         * 比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。
         * 给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？
         * 输入格式
         * 一个日期，格式是”AA/BB/CC”。
         * 即每个’/’隔开的部分由两个 0-9 之间的数字（不一定相同）组成。
         * 输出格式
         * 输出若干个不相同的日期，每个日期一行，格式是”yyyy-MM-dd”。
         * 多个日期按从早到晚排列。
         * 数据范围
         * 0≤A,B,C≤9
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("请输入日期：");
                String date = sc.next();
                int[] arr = StringToArr(date);
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + ",");
                    }
            }

        //将传进的字符串转为为数组并返回
        public static int[] StringToArr(String arr)
            {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arr.length(); i++)
                    {
                        char num = arr.charAt(i);
                        if (num >= 48 && num <= 57)
                            sb.append(num);
                    }
                String temp = sb.toString();
                int num1 = StringToNum(temp.substring(0, 2));
                int num2 = StringToNum(temp.substring(2, 4));
                int num3 = StringToNum(temp.substring(4));
                int[] numArr = {num1, num2, num3};
                return numArr;
            }

        //将字符串转换为数字
        public static int StringToNum(String arr)
            {
                int s = arr.charAt(0) - 48;
                int g = arr.charAt(1) - 48;
                int newNum = s * 10 + g;
                return newNum;
            }
    }
