package com.Encounter.d5_data_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Encounter
 * @date 2024/7/12 15:12<p/>
 * 目标：使用数据输入流读取特定数据
 */
public class DataInputStreamTest2
    {
        public static void main(String[] args)
            {
                try (DataInputStream dis = new DataInputStream(new FileInputStream("file-io-app2/src/test6.txt")))
                    {
                        //必须要与文件中存储的顺序一致，否则会出问题
                        int i = dis.readInt();
                        System.out.println(i);
                        double v = dis.readDouble();
                        System.out.println(v);
                        boolean b = dis.readBoolean();
                        System.out.println(b);
                        String s = dis.readUTF();
                        System.out.println(s);
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
