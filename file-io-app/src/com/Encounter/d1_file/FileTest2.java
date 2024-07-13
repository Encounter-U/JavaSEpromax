package com.Encounter.d1_file;

/**
 * @author Encounter
 * @date 2024/6/29 17:45
 */

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 掌握File提供的判断文件类型，获取文件信息功能<br/>
 * public boolean exists():判断当前文件对象，对应的文件路径是否存在，存在返回true<br/>
 * public boolean isFile():判断当前文件对象指代的是否是文件，是文件返回true，反之<br/>
 * public boolean isDirectory():判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之<br/>
 * public String getName():获取文件名称，包括后缀<br/>
 * public long length():获取文件大小，返回字节个数<br/>
 * public long lastModified():获取文件的最后修改时间<br/>
 * public String getPath():获取文件对象时，使用的路径<br/>
 * public String getAbsolutePath():获取绝对路径
 */
public class FileTest2
    {
        public static void main(String[] args)
            {
                //1.创建文件夹对象，指代某个文件
                File f1=new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\test.txt");

                //2.public boolean exists():判断当前文件对象，对应的文件路径是否存在，存在返回true
                System.out.println(f1.exists());

                //3.public boolean isFile():判断当前文件对象指代的是否是文件，是文件返回true，反之
                System.out.println(f1.isFile());

                //4.public boolean isDirectory():判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之
                System.out.println(f1.isDirectory());

                //5.public String getName():获取文件名称，包括后缀
                System.out.println(f1.getName());

                //6.public long length():获取文件大小，返回字节个数
                System.out.println(f1.length());

                //7.public long lastModified():获取文件的最后修改时间
                System.out.println(f1.lastModified());
                long l = f1.lastModified();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                System.out.println(sdf.format(f1.lastModified()));

                //8.public String getPath():获取文件对象时，使用的路径
                System.out.println(f1.getPath());

                //9.public String getAbsolutePath():获取绝对路径
                File f2=new File("file-io-app\\src\\Encounter.txt");
                System.out.println(f1.getAbsoluteFile());
                System.out.println(f2.getAbsoluteFile());
            }
    }
