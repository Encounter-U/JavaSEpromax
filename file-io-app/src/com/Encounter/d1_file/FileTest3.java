package com.Encounter.d1_file;

/**
 * @author Encounter
 * @date 2024/6/29 19:11
 */

import java.io.File;

/**
 * 掌握File创建和删除文件的相关方法<br/>
 * 1.public boolean createNewFile():创建一个新文件(文件内容为空)，创建成功则返回true，反之<br/>
 * 2.public boolean mkdir():用于创建文件夹，注意：只能创建一级文件夹<br/>
 * 3.public boolean mkdirs():用于创建文件夹，注意：可以创建多级文件夹<br/>
 * 4.public boolean delete():删除文件，或者空文件，注意：不能删除非空文件
 */
public class FileTest3
    {
        public static void main(String[] args) throws Exception
            {
                //1.public boolean createNewFile():创建一个新文件(文件内容为空)，创建成功则返回true，反之
                File f1 = new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\test2.txt");
                boolean newFile = f1.createNewFile();
                System.out.println(newFile);

                //2.public boolean mkdir():用于创建文件夹，注意：只能创建一级文件夹
                File f2=new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\test");
                System.out.println(f2.mkdir());

                //3.public boolean mkdirs():用于创建文件夹，注意：可以创建多级文件夹
                File f3=new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\test\\a\\b");
                System.out.println(f3.mkdirs());

                //4.public boolean delete():删除文件，或者空文件，注意：不能删除非空文件
                System.out.println(f1.delete());
                System.out.println(f3.delete());
                File f4=new File("E:\\XiaomiCloud");
                System.out.println(f4.delete());
            }
    }
