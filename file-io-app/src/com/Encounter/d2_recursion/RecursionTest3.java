package com.Encounter.d2_recursion;

/**
 * @author Encounter
 * @date 2024/7/1 14:47
 */

import java.io.File;
import java.io.IOException;

/**
 * 掌握文件搜索的实现
 */
public class RecursionTest3
    {
        public static void main(String[] args) throws IOException
            {
                //searchFile(new File("D:/"), "QQ.exe");
                searchFile(new File("E:\\XiaomiCloud\\Desktop"), "植物大战僵尸杂交版-防闪退小程序V2.0.exe");
            }

        /**
         * 去目录下搜索某个文件
         *
         * @param dir      目录
         * @param fileName 要搜索的文件名称
         */
        public static void searchFile(File dir, String fileName) throws IOException
            {
                //1.将非法的情况拦截住
                if (dir == null || !dir.exists() || dir.isFile())
                    return;//代表无法搜索

                //2.dir不是null，存在，一定是目录对象
                //获取当前目录下的全部一级文件对象
                File[] files = dir.listFiles();

                //3.判断当前目录下是否存在一级文件对象，一级是否可以拿到一级文件对象
                if (files != null)
                    {
                        //遍历全部一级对象
                        for (File file : files)
                            {
                                if (file.isFile())
                                    {
                                        if (file.getName().equals(fileName))
                                            {
                                                System.out.println(file.getAbsolutePath());
                                                //获取到路径之后直接启动
                                                Runtime runtime = Runtime.getRuntime();
                                                runtime.exec(file.getAbsolutePath());
                                                return;
                                            }
                                    }
                                else
                                    //是文件夹，继续重复过程
                                    searchFile(file, fileName);
                            }
                    }

            }
    }
