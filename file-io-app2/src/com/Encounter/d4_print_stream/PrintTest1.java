package com.Encounter.d4_print_stream;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author Encounter
 * @date 2024/7/12 14:37<p/>
 * 目标：掌握打印流：PrintStream/PrintWriter的用法
 */
public class PrintTest1
    {
        public static void main(String[] args)
            {
                try (//1.创建一个打印流通道
                     //特殊的流不要用多态，因为要用独有方法
                     //PrintStream ps = new PrintStream("file-io-app2/src/test4.txt")
                     //PrintStream ps = new PrintStream("file-io-app2/src/test4.txt","GBK")
                     //PrintStream ps = new PrintStream("file-io-app2/src/test4.txt", Charset.forName("GBK"))
                     //PrintWriter ps = new PrintWriter("file-io-app2/src/test4.txt")
                     //想要追加数据
                     PrintWriter ps = new PrintWriter(new FileWriter("file-io-app2/src/test4.txt",true))
                )
                    {
                        ps.println(97);
                        ps.println('b');
                        ps.println("路明非Dragon");
                        ps.println(true);
                        ps.println(99.5);

                        /*ps.write(97);
                        ps.write('c');*/
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
