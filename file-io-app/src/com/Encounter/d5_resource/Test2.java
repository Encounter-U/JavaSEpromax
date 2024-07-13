package com.Encounter.d5_resource;

/**
 * @author Encounter
 * @CreateDate 2024/7/3 12:40
 */
import java.io.*;
/**
 * 掌握释放资源的方式
 */
public class Test2
    {
        public static void main(String[] args)
            {
                //复制照片
                //初始化变量
                OutputStream fos = null;
                InputStream fis = null;
                try
                    {
                        //1.创建一个字节输入流管道与源文件接通
                        //InputStream fis = new FileInputStream("D:\\图片\\preview.jpg");
                        fis = new FileInputStream("file-io-app/src/Encounter.txt");
                        //2.创建一个字节输出流管道与目标文件接通
                        //OutputStream fos = new FileOutputStream("D:\\图片\\test.jpg");
                        fos = new FileOutputStream("file-io-app/src/Encounter01.txt");

                        //3.创建一个字节数组，负责转移字节数据
                        byte[] buffer = new byte[1024];//1KB

                        //4.从字节输入流中读取字节数据，写出去到字节输出流中，读多少写出去多少
                        int len;//记住每次读了多少个字节
                        while ((len = fis.read(buffer)) != -1)
                            {
                                fos.write(buffer, 0, len);
                            }

                        System.out.println("复制完成");
                    }
                catch (IOException e)
                    {
                        throw new RuntimeException(e);
                    }
                finally
                    {
                        try
                            {
                                if (fos!=null)fos.close();
                            }
                        catch (IOException e)
                            {
                                throw new RuntimeException(e);
                            }
                        try
                            {
                                if (fis!=null)fis.close();
                            }
                        catch (IOException e)
                            {
                                throw new RuntimeException(e);
                            }
                    }
            }
    }
