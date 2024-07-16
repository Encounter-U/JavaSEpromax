package com.Encounter.d0_demo.unitTest.test1;

import java.io.FileWriter;

/**
 * @author Encounter
 * @date 2024/7/13 20:50<p/>
 * 在程序运行过程中，为了日志信息的永久话存储，我们往往将日志信息保存到文件中，在文件中写入数据并且在写入的时候不会清空原来文件中的
 * 内容。
 * 请模拟该过程在上一题创建b.txt文件的下一行中写入“2023-05-31: NullPointException”，并且不会删除原来的数据。
 */
public class Test
    {
        public static void main(String[] args)
            {
                try (FileWriter writer = new FileWriter("properties-xml-log-app/src/com/Encounter/d0_demo/unitTest/test1/b.txt",true))
                    {
                        writer.write("2023-05-31:NullPointException");
                        writer.write("\r\n");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
