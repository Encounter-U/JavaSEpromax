package com.Encounter.d3_transform_stream;

import java.io.*;

/**
 * @author Encounter
 * @date 2024/7/12 13:34<p/>
 * 目标：掌握字符输出转换流的作用
 */
public class OutputStreamWriterTest3
    {
        public static void main(String[] args)
            {
                //指定写出去的字符编码
                try (//1.创建一个文件字节输出流
                     OutputStream os = new FileOutputStream("file-io-app2/src/test_gbk_out.txt");
                     //2.把原始的字节输出流，按照指定的字符集编码转换成字符输出转换流
                     Writer osw=new OutputStreamWriter(os,"GBK");
                     //3.把字符输出流包装成缓冲字符输出流
                     BufferedWriter bw=new BufferedWriter(osw)
                     )
                    {
                        bw.write("路明非Dragon");
                        bw.newLine();
                        bw.write("楚子航No.1");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
