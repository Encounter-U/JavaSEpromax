package com.Encounter.d1_char_stream;

/**
 * @author Encounter
 * @date 2024/7/3 14:52
 */

import java.io.FileReader;
import java.io.Reader;

/**
 * 掌握文件字符输入流每次读取一个字符
 */
public class FileReaderTest1
    {
        public static void main(String[] args)
            {
                //1.创建一个文件字符输入流管道与源文件接通
                try (Reader fr = new FileReader("file-io-app2/src/test.txt"))
                    {
                        //2.读取文本文件内容
                        /*int c;//记住每次读取的字符编号
                        while ((c=fr.read())!=-1)
                            {
                                System.out.print((char) c);
                            }*/

                        //每次读取一个字符，性能较差

                        //3.每次读取多个字符
                        char[] buffer = new char[3];
                        int len;//记录每次读取了多少个字符
                        while ((len = fr.read(buffer)) != -1)
                            {
                                System.out.print(new String(buffer, 0, len));
                            }

                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
