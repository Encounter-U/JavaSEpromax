package com.Encounter.d0_demo.test6_1.test2;

import java.io.File;
import java.io.IOException;

/**
 * @author Encounter
 * @date 2024/6/29 20:12
 */

/**
 * 在开发过程中，有些功能需要我们对本地文件夹进行修改，请编写一个程序，拟该过程
 * ①创建3个file对象 file file1 = new Filel "test.txt”):/相对路径 File file2 = new file("一级目录"); file file3 = new File( "目录A/日录B/目录
 * C)i
 * ②)判断file1是否存在?如果不存在，创建这个文件
 * ③判断file2是否存在?如果不存在，创建这个目录。
 * 4判断file3是否存在?如果不存在，创建这个多级目录。
 */
public class Test
    {
        public static void main(String[] args) throws IOException
            {
                File file1 = new File("test.txt");
                File file2 = new File("一级目录");
                File file3 = new File("目录A/目录B/目录C");
                mkdirs(file3);
                mkdirs(file2);
                boolean exists = file1.exists();
                System.out.println("是否存在："+exists);
                if (!exists)
                    {
                        System.out.println("是否创建成功："+file1.createNewFile());
                    }
            }
        public static void mkdirs(File file)
            {
                boolean exists = file.exists();
                System.out.println("是否存在："+exists);
                if (!exists)
                    {
                        System.out.println("是否创建成功："+file.mkdirs());
                    }
            }
    }
