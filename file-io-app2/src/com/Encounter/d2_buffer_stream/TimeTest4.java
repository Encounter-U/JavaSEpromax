package com.Encounter.d2_buffer_stream;

import java.io.*;

/**
 * @author Encounter
 * @date 2024/7/3 20:03<p/>
 * 观察原始流和缓冲流的性能
 */
public class TimeTest4
    {
        //视频路径
        private final static String SRC_FILE = "D:\\视频\\joker(露脸).mp4";
        //要复制的目的地
        private final static String DEST_FIFE = "D:\\视频\\test\\";

        public static void main(String[] args)
            {
                //copy01();//低级字节流一个一个字节的复制，太慢太慢，都显示不出来，直接淘汰
                copy02();//低级字节流按照一个一个字节数组的形式复制，速度较慢
                //copy03();//缓冲流按照一个一个字节的形式复制，速度较慢
                copy04();//缓冲流按照一个一个字节数组的形式复制，速度极快，推荐使用
            }

        public static void copy01()
            {
                //拿到开始时间
                long startTime = System.currentTimeMillis();
                try (InputStream is = new FileInputStream(SRC_FILE);
                     OutputStream os = new FileOutputStream(DEST_FIFE + "1.mp4"))
                    {
                        int b;
                        while ((b = is.read()) != -1)
                            {
                                os.write(b);
                            }
                        //结束时间
                        long endTime = System.currentTimeMillis();
                        System.out.println("低级字节流copy01一个一个字节复制总耗时：" + (endTime - startTime) / 1000.0 + "s");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }

        public static void copy02()
            {
                //开始时间
                long startTime = System.currentTimeMillis();
                try (InputStream is = new FileInputStream(SRC_FILE);
                     OutputStream os = new FileOutputStream(DEST_FIFE + "2.mp4"))
                    {
                        byte[] buffer = new byte[1024 * 64];//1KB
                        int b;
                        while ((b = is.read(buffer)) != -1)
                            {
                                os.write(buffer, 0, b);
                            }
                        //结束时间
                        long endTime = System.currentTimeMillis();
                        System.out.println("低级字节流copy02按照字节数组复制总耗时：" + (endTime - startTime) / 1000.0 + "s");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }

        public static void copy03()
            {
                //开始时间
                long startTime = System.currentTimeMillis();
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_FILE));
                     BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_FIFE + "3.mp4")))
                    {
                        int b;
                        while ((b = bis.read()) != -1)
                            {
                                bos.write(b);
                            }
                        //结束时间
                        long endTime = System.currentTimeMillis();
                        System.out.println("缓冲字节流copy03一个一个字节复制总耗时：" + (endTime - startTime) / 1000.0 + "s");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }

        public static void copy04()
            {
                //开始时间
                long startTime = System.currentTimeMillis();
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_FILE), 64 * 1024);
                     //配置缓冲池大小32KB
                     BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_FIFE + "4.mp4"), 64 * 1024))
                    {
                        byte[] buffer = new byte[1024 * 64];//1KB
                        int b;
                        while ((b = bis.read(buffer)) != -1)
                            {
                                bos.write(buffer, 0, b);
                            }
                        //结束时间
                        long endTime = System.currentTimeMillis();
                        System.out.println("缓冲字节流copy04按照字节数组复制总耗时：" + (endTime - startTime) / 1000.0 + "s");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
