package com.Encounter.d3_charset;

/**
 * @author Encounter
 * @date 2024/7/1 16:20
 */

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 掌握如何使用Java代码完成对字符的编码和解码
 */
public class Test
    {
        public static void main(String[] args) throws UnsupportedEncodingException
            {
                //1.编码
                String data = "a我b";
                byte[] bytes = data.getBytes();//默认按照平台字符集（UTF-8）进行编码
                System.out.println(Arrays.toString(bytes));

                //按照指定字符集编码
                byte[] b1 = data.getBytes("GBK");
                System.out.println(Arrays.toString(b1));

                //2.解码
                String str=new String(bytes);//按照平台默认编码（UTF-8）解码
                System.out.println(str);

                String str1=new String(b1,"GBK");
                System.out.println(str1);
            }
    }
