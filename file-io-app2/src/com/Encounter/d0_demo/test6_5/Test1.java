package com.Encounter.d0_demo.test6_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * @author Encounter
 * @date 2024/7/3 21:24<p/>
 * 设计一个程序，使用字符缓冲输入流读取文件内容并打印到控制台，要求如下:
 * 1.创建一个a.txt,在里面填充古诗内容《静夜思》
 * 2.在测试类中实现将该文件中内容打印到控制台
 */
public class Test1
    {
        public static void main(String[] args)
            {
                try (Reader is = new FileReader("file-io-app2/src/test.txt");
                     BufferedReader br = new BufferedReader(is))
                    {
                        String line;
                        while ((line = br.readLine()) != null)
                            {
                                System.out.println(line);
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
