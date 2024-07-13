package com.Encounter.d0_demo.test6_1.test1;

import java.io.File;

/**
 * @author Encounter
 * @date 2024/6/29 20:02
 */

/**
 * 编写一个程序，请完成一下内容
 * ①请在D盘根目录下创建一个文件:test1.txt(随意录入一些内容);再创建一个目录:测试目录
 * ②创建File对象，分别关联test1.txt，测试目录。获取、打印file1和file2的绝对路径;
 * ③获取、打印file1和file2的文件名和目录名,
 * ④获取、打印file1和file2的文件大小;
 * ⑤分别判断file1和file2是否存在;
 * ⑥分别判断file1和file2是否是文件?是否是目录?
 * 在控制台打印效果如图
 * 文件1的绝对路径是:D:test1.txt
 * 文件夹2的绝对路径是:D:测试目录
 * 文件1的名称是:test1.txt
 * 文件夹2的名称是:测试目录
 * 文件1的大小是:4
 * 文件夹2的大小是(文件夹获取的不准确):测试目录
 * file1表示的文件存在吗?true
 * file2表示的文件夹存在吗?true
 * file1表示的是文件吗?true
 * file2表示的是文件吗?false
 */
public class Test
    {
        public static void main(String[] args)
            {
                File f1=new File("D:/test1.txt");
                File f2=new File("D:/test");
                System.out.println("f1的名称："+f1.getName());
                System.out.println("f2的名称："+f2.getName());
                System.out.println("f1的绝对路径："+f1.getAbsolutePath());
                System.out.println("f2的绝对路径："+f2.getAbsolutePath());

                System.out.println("f1的大小："+f1.length());
                System.out.println("f2的大小："+f2.length());

                System.out.println("f1是否存在："+f1.exists());
                System.out.println("f2是否存在："+f2.exists());

                System.out.println("f1是文件吗："+f1.isFile());
                System.out.println("f2是文件吗："+f2.isFile());
                System.out.println("f1是文件夹吗："+f1.isDirectory());
                System.out.println("f2是文件夹吗："+f2.isDirectory());
            }
    }
