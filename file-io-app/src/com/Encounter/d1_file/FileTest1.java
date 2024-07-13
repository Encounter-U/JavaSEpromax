package com.Encounter.d1_file;

/**
 * @author Encounter.txt
 * @date 2024/6/29 17:24
 */

import java.awt.*;
import java.io.File;

/**
 * 掌握File创建对象，代表具体文件的方案
 */
public class FileTest1
    {
        public static void main(String[] args)
            {
                //1.创建一个File对象，指代某个具体文件
                //File f1 = new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\test.txt");
                //File f1 = new File("E:/XiaomiCloud/Desktop/博学谷/File/test.txt");
                //根据系统决定分隔符，可跨平台使用
                File f1 = new File("E:"+File.separator+"XiaomiCloud"+
                        File.separator+"Desktop"+File.separator+"博学谷"+
                        File.separator+"File"+File.separator+"test.txt");
                System.out.println(f1.length());//文件大小
                System.out.println(f1.getName());

                File f2 = new File("E:/XiaomiCloud/Desktop/博学谷/File");
                System.out.println(f2.length());//文件夹大小，而非内部文件大小

                //File对象可以指代不存在的文件路径
                File f3 = new File("E:/XiaomiCloud/Desktop/博学谷/File/aaa.txt");
                System.out.println(f3.length());
                System.out.println(f3.exists());//false

                //定义的文件在模块中
                //绝对路径
                //File f4 = new File("D:\\Study_Document\\BoXueGu\\JavaSEpromax\\file-io-app\\src\\Encounter.txt");

                //相对路径（重点）：不带盘符，默认直接去工程下寻找文件
                File f4 = new File("file-io-app\\src\\Encounter.txt");
                System.out.println(f4.length());
            }
    }
