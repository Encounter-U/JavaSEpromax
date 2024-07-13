package com.Encounter.d0_demo.test6_1.test3;

import java.io.File;

/**
 * @author Encounter
 * @date 2024/6/29 20:25
 */

/**
 * 请编写代码遍历你电脑上某个文件夹下的一级子文件，并打印他们的绝对路径，如果是文件还需要打印文件名和文件大小
 */
public class Test
    {
        public static void main(String[] args)
            {
                File file = new File("E:\\XiaomiCloud\\Desktop");
                File[] list = file.listFiles();
                for (File file1 : list)
                    {
                        if (file1.isFile())
                            System.out.println("绝对路径:" + file1.getAbsolutePath() + "  文件名：" + file1.getName() + "  文件大小：" + file1.length());
                        else
                            System.out.println("绝对路径：" + file1.getAbsolutePath());
                    }
            }
    }
