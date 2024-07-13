package com.Encounter.d3_transform_stream;

import java.io.*;

/**
 * @author Encounter
 * @date 2024/7/12 13:20<p/>
 * 目标：掌握字符输入转换流的作用
 */
public class InputStreamReaderTest2
    {
        public static void main(String[] args)
            {
                try (//1.得到文件的原始字节流（GBK的字节流形式）
                     InputStream is = new FileInputStream("file-io-app2/src/test_gbk.txt");
                     //2.把原始的字节输入流安札指定的字符集编码按照指定的字符集编码转换成字符输入流)
                     Reader isr = new InputStreamReader(is, "GBK");
                     //3.把字符输入流包装成缓冲字符输入流
                     BufferedReader br = new BufferedReader(isr)
                )
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
