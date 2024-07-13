package com.Encounter.d3_transform_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * @author Encounter
 * @date 2024/7/3 20:40<p/>
 * 掌握不同编码读取乱码的问题
 */
public class Test1
    {
        public static void main(String[] args)
            {
                try (//1.创建一个文件字符输入流与源文件接通
                     //代码编码：UTF-8   文件编码：UTF-8
                     //Reader fr = new FileReader("file-io-app2/src/test.txt");

                     //代码编码：UTF-8   文件编码：GBK
                     Reader fr = new FileReader("file-io-app2/src/test_gbk.txt");
                     //2.把文件字符输入流包装为缓冲字符输入流
                     BufferedReader br = new BufferedReader(fr);)
                    {
                        String line;
                        while ((line=br.readLine())!=null)
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
