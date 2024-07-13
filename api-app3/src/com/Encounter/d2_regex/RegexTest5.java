package com.Encounter.d2_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Encounter
 * @date 2024/6/22 19:20
 */


/**
 * 了解使用正则表达式去文本中爬取想要的信息（分组爬取）
 * 贪婪匹配和非贪婪匹配
 */

public class RegexTest5
    {
        public static void main(String[] args)
            {
                // 目标:了解使用正则表达式去文本中爬取想要的信息。
                String data = "来黑马程序员学习Java，\n" +
                        "电话:18512516758，18512508907\n" +
                        "或者联系邮箱: boniu@itcast.cn\n" +
                        "座机电话:01036517895，010-98951256\n" +
                        "邮箱:bozai@itcast.cn，\n" +
                        "邮箱2:dlei0009@163.com，\n" +
                        "热线电话:400-618-9090，400-618-4000，\n" +
                        "4006184000，4006189090\n";
                //System.out.println(data);

                //1.创建一个匹配规则对象，封装正则表达式
                String regex="(\\w{2,})@\\w{2,20}(\\.\\w{2,10}){1,2}";
                Pattern p=Pattern.compile(regex);

                //2.把内容和爬取规则建立联系，得到一个匹配器对象
                Matcher m=p.matcher(data);

                //3.开始使用匹配器对象，开始爬取内容
                while (m.find())
                    {
                        String rs = m.group(1);//只要第一组数据，即第一个括号里的内容
                        System.out.println(rs);
                    }
            }
    }
