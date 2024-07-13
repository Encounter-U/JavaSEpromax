package com.Encounter.d4_byte_stream;

/**
 * @author Encounter
 * @date 2024/7/2 17:30
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 掌握文件字节输出流FileOutputStream的使用
 */
public class FileOutputStreamTest4
    {
        public static void main(String[] args) throws Exception
            {
                //1.创建一个字节输出流管道与目标文件接通
                //覆盖管道
                //OutputStream fos = new FileOutputStream("file-io-app/src/OutText.txt");
                //追加数据管道
                OutputStream fos = new FileOutputStream("file-io-app/src/OutText.txt",true);


                //2.开始写字节数据出去
                fos.write(97);//a
                fos.write('b');//'b'也是一个字节

                //fos.write('磊');//默认只能写出去一个字节

                byte[] bytes = "董鑫牛逼".getBytes();
                fos.write(bytes);
                fos.write(bytes,0,6);

                //换行
                fos.write("\r\n".getBytes());

                fos.close();
            }
    }
