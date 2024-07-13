package com.Encounter.d0_demo.afterClassExercises;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Encounter
 * @date 2024/7/3 21:07<p/>
 * 4. 描述:利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
 * ,使用循环读取，一次读取一个字节，直到读取到文件未尾。将读取的字节输出到控制台
 */
public class Test4
    {
        public static void main(String[] args) throws IOException
            {
                InputStream is=new FileInputStream("file-io-app2/src/test2.txt");
                int b;
                while ((b=is.read())!=-1)
                    {
                        System.out.println(b);
                    }
            }
    }
