package com.Encounter.d2_buffer_stream;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Encounter
 * @date 2024/7/3 19:43<p/>
 * 掌握字符输入流的用途
 */
public class BufferedReaderTest2
    {
        public static void main(String[] args)
            {
                try (BufferedReader br = new BufferedReader(new FileReader("file-io-app2/src/test.txt")))
                    {
                        /*char[] buffer = new char[3];
                        int len;
                        while ((len = br.read(buffer)) != -1)
                            {
                                System.out.print(new String(buffer, 0, len));
                            }*/
                        /*System.out.println(br.readLine());
                        System.out.println(br.readLine());
                        System.out.println(br.readLine());
                        System.out.println(br.readLine());//无内容，返回null*/
                        String line;
                        while ((line = br.readLine()) != null)
                            System.out.println(line);
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
