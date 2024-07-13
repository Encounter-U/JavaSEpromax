package com.Encounter.d0_demo.afterClassExercises;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Encounter
 * @date 2024/7/3 21:05<p/>
 * 3.描述:在D盘下，有-c.txt 文件中内容为:HelloWorld
 * 在c.txt文件原内容基础上，添加五句|love java，而且要实现一句一行操作(注:原文不可覆盖)。
 * 利用字节输出流对象往C盘下c.txt文件输出5句:"ilove java'
 */
public class Test3
    {
        public static void main(String[] args) throws IOException
            {
                OutputStream os=new FileOutputStream("file-io-app2/src/test2.txt",true);
                os.write("i love java".getBytes());
                os.close();
            }
    }
