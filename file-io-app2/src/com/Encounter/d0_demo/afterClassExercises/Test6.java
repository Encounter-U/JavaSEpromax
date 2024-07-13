package com.Encounter.d0_demo.afterClassExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Encounter
 * @date 2024/7/3 21:13<p/>
 * 6.描述:利用字书流将E盘下的a.png图片复制到D盘下(文件名保存一致
 * 要求:
 * 一次读写一个字节的方式
 */
public class Test6
    {
        public static void main(String[] args) throws Exception
            {
                InputStream is = new FileInputStream("D:\\图片\\preview.jpg");
                OutputStream os = new FileOutputStream("D:\\图片\\1.jpg");

                byte[] buffer = new byte[5];
                int len;
                while ((len = is.read(buffer)) != -1)
                    {
                        os.write(buffer, 0, len);
                    }
            }
    }
