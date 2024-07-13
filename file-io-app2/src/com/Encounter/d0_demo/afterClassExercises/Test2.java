package com.Encounter.d0_demo.afterClassExercises;

import java.io.*;

/**
 * @author Encounter
 * @date 2024/7/3 20:59<p/>
 * 2.描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
 */
public class Test2
    {
        public static void main(String[] args) throws IOException
            {
                OutputStream os=new FileOutputStream("file-io-app2/src/test2.txt");
                os.write("i love you".getBytes());
                os.close();
            }
    }
