package com.Encounter.d2_buffer_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author Encounter
 * @date 2024/7/3 19:48<p/>
 * 掌握字符缓冲输出流的用法
 */
public class BufferedWriteStreamTest3
    {
        public static void main(String[] args)
            {
                //创建一个字符缓冲输出流包装原始的字符输出流
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("file-io-app2/src/test3.txt")))
                    {
                        bw.write('a');
                        bw.write(97);
                        bw.write('磊');
                        //bw.write("\r\n");
                        bw.newLine();

                        bw.write("路明非Dragon");
                        //bw.write("\r\n");
                        bw.newLine();
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
