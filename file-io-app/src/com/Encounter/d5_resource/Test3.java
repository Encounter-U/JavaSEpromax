package com.Encounter.d5_resource;

import java.io.*;

/**
 * @author Encounter
 * @date 2024/7/3 12:49
 */

/**
 * JDK7新增的资源释放方式
 */
public class Test3
    {
        public static void main(String[] args)
            {
                //复制照片
                try (//1.创建一个字节输入流管道与源文件接通
                     //InputStream fis = new FileInputStream("D:\\图片\\preview.jpg");
                     InputStream fis = new FileInputStream("file-io-app/src/Encounter.txt");
                     //2.创建一个字节输出流管道与目标文件接通
                     //OutputStream fos = new FileOutputStream("D:\\图片\\test.jpg");
                     OutputStream fos = new FileOutputStream("file-io-app/src/Encounter01.txt");

                     //注意：此处只能放置资源对象（流对象）
                     //int age=22;
                     //资源都是会实现AutoCloseable接口，资源都会有一个close方法，并且资源放在这里用完之后会被自动调用其close方法完成资源的释放操作
                     MyConnection conn=new MyConnection()
                )
                    {
                        //3.创建一个字节数组，负责转移字节数据
                        byte[] buffer = new byte[1024];//1KB

                        //4.从字节输入流中读取字节数据，写出去到字节输出流中，读多少写出去多少
                        int len;//记住每次读了多少个字节
                        while ((len = fis.read(buffer)) != -1)
                            {
                                fos.write(buffer, 0, len);
                            }

                        System.out.println(conn);
                        System.out.println("复制完成");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
