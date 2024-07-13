package com.Encounter.d0_demo.test6_4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/7/3 16:00<p/>
 * 我们在开发过程中，为了保证来自键盘录入的信息不丢失，我们经常会使用字符流将来自键盘录入的信息进行保存到本地实现永久化存储，请按照
 * 以下要求模拟该过程:
 * ①创建一个测试类，在测试类中通过Scanner实现键盘录入
 * ②使用字符流将键盘录入的信息存储到本地文件中
 */
public class Test2
    {
        public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                try (Writer fw = new FileWriter("file-io-app2/src/scanner.txt",true))
                    {
                        System.out.println("请输入要保存的信息：");
                        fw.write(sc.nextLine().toCharArray());
                        fw.write("\r\n");//换行
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
