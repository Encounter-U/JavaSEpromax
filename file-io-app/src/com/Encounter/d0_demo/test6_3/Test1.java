package com.Encounter.d0_demo.test6_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Encounter
 * @date 2024/7/2 18:02
 */

/**
 * 在当前项目下编写一个a.txt文本，在其中添加内容| Love China ，编写一个测试类
 * 读取文件中内容，并将结果打印在控制台
 */
public class Test1
    {
        public static void main(String[] args) throws Exception
            {
                OutputStream fos = new FileOutputStream("file-io-app/src/a.txt");
                InputStream fis = new FileInputStream("file-io-app/src/a.txt");

                //写入
                fos.write("I Love China".getBytes());

                byte[] bytes = fis.readAllBytes();
                System.out.println(new String(bytes));

                fis.close();
                fos.close();
            }
    }
