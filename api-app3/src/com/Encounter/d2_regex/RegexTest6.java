package com.Encounter.d2_regex;

import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/6/22 19:38
 */
public class RegexTest6
    {
        public static void main(String[] args)
            {
                //1.public String replaceAll(String regex,String newStr)：按照正则表达式匹配的内容进行替换
                //需求1：请把 路明非ai8888楚子航999aa5566陈墨瞳fbbfsfs42425上杉绘梨衣，中间的非中文字符替换为“-”
                String str1 = "路明非ai8888楚子航999aa5566陈墨瞳fbbfsfs42425上杉绘梨衣";
                System.out.println(str1.replaceAll("\\w+", "-"));

                //需求2（拓展）：某语音系统，收到一个口吃的人说的“我我我喜欢编编编编编编程程程程！”，优化为“我喜欢编程！”
                /**
                 * (.)一组：.匹配任意字符的
                 * \\1：为这个组声明一个组号：1号
                 * +：声明必须是重复的字
                 * $1可以去取到第1组代表的那个重复的字
                 */
                String str2 = "我我我喜欢编编编编编编程程程程！";
                System.out.println(str2.replaceAll("(.)\\1+", "$1"));

                //2.public String[] split(Sting regex)：按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组
                //需求1：请把 路明非ai8888楚子航999aa5566陈墨瞳fbbfsfs42425上杉绘梨衣，中的人名获取出来
                String str3 = "路明非ai8888楚子航999aa5566陈墨瞳fbbfsfs42425上杉绘梨衣";
                String[] split = str3.split("\\w+");
                System.out.println(Arrays.toString(split));

            }
    }
