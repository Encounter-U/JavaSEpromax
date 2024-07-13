package com.Encounter.d1_file;

/**
 * @author Encounter
 * @date 2024/6/29 19:40
 */

import java.io.File;

/**
 * 掌握File提供的遍历文件夹的方法
 */
public class FileTest4
    {
        public static void main(String[] args)
            {
                //1.public String[] list():获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回
                File f2=new File("E:\\XiaomiCloud\\Desktop");
                String[] list = f2.list();
                for (String s : list)
                    {
                        System.out.println(s);
                    }

                //2.public File[] listFiles():(重点)获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回（重点）
                File[] files = f2.listFiles();
                for (File file : files)
                    {
                        System.out.println(file.getAbsoluteFile());
                    }

                //当主调为文件或路径不存在时，返回null
                //File f1=new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\test.txt");
                File f1=new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\try");
                String[] list1 = f1.list();
                System.out.println(list1);

                //当主调为空文件夹时，返回一个长度为0的数组
                File f3=new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\test");
                String[] list2 = f3.list();
                System.out.println(list2.length);

                //当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹的路径放在File数组中返回

                //当主调是一个文件夹，且里面有隐藏文件夹时，将里面的所有文件和文件夹的路径放在File数组中返回，包含隐藏文件

                //当主调是一个文件夹，但是没有权限访问该文件夹时，返回null
            }
    }
