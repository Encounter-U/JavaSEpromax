package com.Encounter.d6_object_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Encounter
 * @date 2024/7/12 17:13<p/>
 * 掌握对象字节输出流的使用，序列化对象
 */
public class Test1ObjectOutputStream
    {
        public static void main(String[] args)
            {
                try (//2.创建一个对象字节输出流包装原始的字节输出流
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file-io-app2/src/test7.txt")))
                    {
                        //1.创建一个Java对象
                        User u=new User("admin","路明非",22,"lumingfei");

                        //3.序列化对象到文件中去
                        //存储的不是乱码，而是特殊存储方法（带数据类型）
                        oos.writeObject(u);
                        System.out.println("序列化对象成功！！！");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
