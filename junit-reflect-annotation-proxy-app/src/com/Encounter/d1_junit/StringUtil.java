package com.Encounter.d1_junit;

/**
 * @author Encounter
 * @date 2024/07/19 12:11<br/>
 * 字符串工具类
 */
public class StringUtil
    {
        public static void printNumber(String name)
            {
                if (name == null)
                    {
                        System.out.println(0);
                        return;//停掉方法
                    }
                System.out.println("名字长度是：" + name.length());
            }
        
        /**
         * 求字符串最大索引
         *
         * @param data
         * @return
         */
        public static int getMaxIndex(String data)
            {
                if (data == null)
                    return -1;
                return data.length() - 1;
            }
    }
