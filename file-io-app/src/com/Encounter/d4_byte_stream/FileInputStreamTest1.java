package com.Encounter.d4_byte_stream;

/**
 * @author Encounter
 * @date 2024/7/2 14:42
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 掌握文件字节输入流，每次读取一个字节
 */
public class FileInputStreamTest1
    {
        public static void main(String[] args) throws IOException
            {
                File file = new File("file-io-app/src/Encounter.txt");
                //1.创建文件字节输入流管道，与源文件接通
                //简化写法，推荐使用
                InputStream fis = new FileInputStream("file-io-app/src/Encounter.txt");

                //2.开始读取文件的字节数据
                /*int r1 = fis.read();
                System.out.println((char) r1);

                int r2 = fis.read();
                System.out.println((char)r2);

                int r3 = fis.read();
                //System.out.println((char) r3);
                System.out.println(r3);*/

                //3.使用循环改造代码
                int b;//记录读取的字节
                while ((b = fis.read()) != -1)
                    {
                        System.out.print((char) b);
                    }

                //读取数据的性能很差！
                //读取汉字输出会乱码且无法避免！
                //流使用完毕之后，必须关闭！释放系统资源！

                fis.close();
            }
    }
