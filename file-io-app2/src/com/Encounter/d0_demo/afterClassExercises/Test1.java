package com.Encounter.d0_demo.afterClassExercises;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Encounter
 * @date 2024/7/3 20:57<p/>
 * 1.描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符'a
 */
public class Test1
    {
        public static void main(String[] args) throws IOException
            {
                OutputStream os=new FileOutputStream("file-io-app2/src/test2.txt");
                os.write('a');
                os.close();
            }
    }
