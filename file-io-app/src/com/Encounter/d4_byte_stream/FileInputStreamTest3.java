package com.Encounter.d4_byte_stream;

/**
 * @author Encounter
 * @date 2024/7/2 17:06
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 使用文件字节输入流一次读取完文件的全部字节
 */
public class FileInputStreamTest3
    {
        public static void main(String[] args) throws Exception
            {
                //1.一次性读取完文件的全部字节到一个字节数组中去
                //创建一个字节输入流管道与源文件接通
                InputStream fis = new FileInputStream("file-io-app/src/adad.txt");

                //2.准备一个字节数组，大小与文件的大小正好一样大
                //适合一些较小文件，但开发中一般不会遇到很大的文件，因此该方法一般是不会出问题的
                /*File file = new File("file-io-app/src/adad.txt");
                long size = file.length();
                byte[] buffer = new byte[(int) size];


                int len = fis.read(buffer);
                System.out.println(new String(buffer));

                System.out.println(size);
                System.out.println(len);*/

                byte[] bytes = fis.readAllBytes();
                System.out.println(new String(bytes));

                fis.close();
            }
    }
