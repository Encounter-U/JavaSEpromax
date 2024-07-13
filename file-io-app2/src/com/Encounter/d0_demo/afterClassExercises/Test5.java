package com.Encounter.d0_demo.afterClassExercises;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Encounter
 * @date 2024/7/3 21:09<p/>
 * 5.描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
 * ,使用循环读取，一次读取一个字节数组，直到读取到文件未尾，将读取到的字节数组转换成字符串输出到控制
 * 台。
 */
public class Test5
    {
        public static void main(String[] args) throws IOException
            {
                InputStream is = new FileInputStream("file-io-app2/src/test2.txt");
                int b;
                byte[] buffer = new byte[5];
                while ((b = is.read(buffer)) != -1)
                    {
                        System.out.print(new String(buffer, 0, b));
                    }
            }
    }
