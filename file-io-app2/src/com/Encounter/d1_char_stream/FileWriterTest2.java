package com.Encounter.d1_char_stream;

/**
 * @author Encounter
 * @date 2024/7/3 15:06
 */

import java.io.FileWriter;
import java.io.Writer;

/**
 * 掌握文件字符输出流，写字符数据出去<br/>
 * 1.public void write(int c):写一个字符出去<br/>
 * 2.public void write(String c):写一个字符串出去<br/>
 * 3.public void write(String c, int pos, int len):写字符串的一部分出去<br/>
 * 4.public void write(char[] buffer):写一个字符数组出去<br/>
 * 5.public void write(char[] buffer, int pos, int len):写字符数组的一部分出去
 */
public class FileWriterTest2
    {
        public static void main(String[] args)
            {
                //0.创建一个文件字符输出流管道与目标文件接通
                //覆盖管道
                //try (Writer fw = new FileWriter("file-io-app2/src/test2.txt"))
                //追加数据的管道
                try (Writer fw = new FileWriter("file-io-app2/src/test2.txt",true))
                    {
                        //1.public void write(int c):写一个字符出去
                        fw.write(97);
                        fw.write('a');
                        fw.write('磊');//写一个字符出去
                        fw.write("\r\n");//换行

                        //2.public void write(String c):写一个字符串出去
                        fw.write("路明非Dragon");
                        fw.write("\r\n");

                        //3.public void write(String c, int pos, int len):写字符串的一部分出去
                        fw.write("路明非Dragon",0,3);
                        fw.write("\r\n");

                        //4.public void write(char[] buffer):写一个字符数组出去
                        char[] buffer = "abcdefg".toCharArray();
                        fw.write(buffer);
                        fw.write("\r\n");

                        //5.public void write(char[] buffer, int pos, int len):写字符数组的一部分出去
                        fw.write(buffer,0,3);
                        fw.write("\r\n");

                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
