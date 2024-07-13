package com.Encounter.d0_demo.afterClassExercises2.test1;

import java.io.*;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/7/13 14:36<p/>
 * 项目需求:请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以输入多条信息，每条信息存储
 * 行。当用户输入:”886”时，程序结束。
 * [操作步骤:
 * 创建MainAPP类,并包含main()方法 按照上述要求实现程序代码:
 */
public class MainApp
    {
        public static void main(String[] args)
            {
                try (Scanner sc = new Scanner(System.in);
                     BufferedWriter osw = new BufferedWriter(
                             new FileWriter("file-io-app2/src/com/Encounter/d0_demo/afterClassExercises2/test1/Info.txt",true)))
                    {
                        while (true)
                            {
                                System.out.print("请输入要储存的信息：");
                                String s = sc.nextLine();
                                if (!s.equals("886"))
                                    {
                                        osw.write(s);
                                        osw.newLine();
                                        osw.flush();
                                    }
                                else
                                    break;
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
