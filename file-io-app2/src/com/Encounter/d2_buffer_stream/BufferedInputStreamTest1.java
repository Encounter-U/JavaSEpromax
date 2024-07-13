package com.Encounter.d2_buffer_stream;

import java.io.*;

/**
 * @author Encounter
 * @date 2024/7/3 19:24<p/>
 */
public class BufferedInputStreamTest1
    {
        public static void main(String[] args)
            {
                try (InputStream is = new FileInputStream("file-io-app2/src/test.txt");
                     //1.定义一个字节缓冲流包装原始的字节输入流
                     InputStream bis = new BufferedInputStream(is);

                     OutputStream os = new FileOutputStream("file-io-app2/src/test_bak.txt");
                     //2.定义一个字节缓冲流包装原始的字节输出流
                     OutputStream bos = new BufferedOutputStream(os))
                    {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = bis.read(buffer)) != -1)
                            {
                                bos.write(buffer, 0, len);
                            }
                        System.out.println("复制完成！");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
