package com.Encounter.d4_byte_stream;

/**
 * @author Encounter
 * @date 2024/7/2 15:07
 */

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 掌握使用FileInputStream每次读取多个字节
 */
public class FileInputStreamTest2
    {
        public static void main(String[] args) throws Exception
            {
                //1.创建字节输入流对象代表字节输入流管道与源文件接通
                InputStream fis = new FileInputStream("file-io-app/src/Encounter.txt");

                //2.开始读取文件中的字节数据，每次读取多个字节
                //public int read(byte b[]) throw Exception
                // 每次读取多个字节到字节数组中，返回读取的字节数量，读取完毕会返回-1
                /*byte[] buffer=new byte[3];
                int r1 = fis.read(buffer);
                String s = new String(buffer);
                System.out.println(s);
                System.out.println(r1);

                int r2 = fis.read(buffer);
                String s2 = new String(buffer,0,r2);
                System.out.println(s2);
                System.out.println(r2);*/

                //3.使用循环改造
                int b;//记住读取了多少个字节
                byte[] buffer = new byte[3];
                while ((b = fis.read(buffer)) != -1)
                    {
                        System.out.print(new String(buffer, 0, b));
                    }

                //性能得到明显提升！！
                //这种方案也不能避免读取汉字出现乱码的问题！！

                fis.close();
            }
    }
