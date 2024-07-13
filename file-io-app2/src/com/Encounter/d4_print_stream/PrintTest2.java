package com.Encounter.d4_print_stream;

import java.io.PrintStream;

/**
 * @author Encounter
 * @date 2024/7/12 14:55<p/>
 * 目标：了解输出语句的重定向
 */
public class PrintTest2
    {
        public static void main(String[] args)
            {
                System.out.println("路明非");
                System.out.println("楚子航");
                try (PrintStream ps = new PrintStream("file-io-app2/src/test5.txt"))
                    {
                        //把系统默认的打印流对象改成自己设置的打印流
                        System.setOut(ps);
                        System.out.println("夏弥");
                        System.out.println("上杉绘梨衣");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
