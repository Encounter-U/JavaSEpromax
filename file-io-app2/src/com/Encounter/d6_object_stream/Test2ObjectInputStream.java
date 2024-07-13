package com.Encounter.d6_object_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Encounter
 * @date 2024/7/12 17:13<p/>
 * 目标：掌握对象字节输入流的使用，反序列化对象
 */
public class Test2ObjectInputStream
    {
        public static void main(String[] args)
            {
                try (//1.创建一个对象字节输入流管道，包装低级的字节输入流与源文件接通
                     ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file-io-app2/src/test7.txt")))
                    {
                        User user = (User)ois.readObject();
                        System.out.println(user);
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
