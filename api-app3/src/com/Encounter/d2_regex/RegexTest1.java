package com.Encounter.d2_regex;

/**
 * @author Encounter
 * @date 2024/6/22 18:18
 */

/**
 * 目标：使用正则表达式校验数据格式的合法性<br/>
 * 需求：校验QQ号是否正确，要求全是数字，长度是（6-20）之间，不能以0开头
 */
public class RegexTest1
    {
        public static void main(String[] args)
            {
                System.out.println(checkQQ(null));
                System.out.println(checkQQ("1231s1235"));
                System.out.println(checkQQ("3067578173"));

                System.out.println("=====================");

                System.out.println(checkQQNum(null));
                System.out.println(checkQQNum("1231s1235"));
                System.out.println(checkQQNum("3067578173"));


            }

        public static boolean checkQQNum(String QQ)
            {
                return QQ!=null&&QQ.matches("[1-9]\\d{5,19}");
            }

        public static boolean checkQQ(String QQ)
            {
                //1.判断是否为null，以0开头，是否在6-20位之间
                if (QQ == null || QQ.startsWith("0") || QQ.length() < 6 || QQ.length() > 20)
                    return false;

                //2.判断是否为纯数字
                for (int i = 0; i < QQ.length(); i++)
                    {
                        //根据索引提取当前位置字符
                        char ch = QQ.charAt(i);
                        //若非数字，QQ号不合法
                        if (ch < '0' || ch > '9')
                            return false;
                    }
                return true;
            }
    }
