package com.Encounter.d5_data_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author Encounter
 * @date 2024/7/12 15:03<p/>
 * 目标：数据输出流
 */
public class DataOutputStreamTest1
    {
        public static void main(String[] args)
            {
                try (//1.创建一个数据输出流包装低级的字节输出流
                     DataOutputStream dos = new DataOutputStream(new FileOutputStream("file-io-app2/src/test6.txt")))
                    {
                        //存入的数据不是乱码，而是一种带数据类型的特殊存储方式，方便下次读取
                        dos.writeInt(97);
                        dos.writeDouble(97.7);
                        dos.writeBoolean(true);
                        dos.writeUTF("路明非");

                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
