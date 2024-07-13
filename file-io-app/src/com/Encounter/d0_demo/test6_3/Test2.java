package com.Encounter.d0_demo.test6_3;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author Encounter
 * @date 2024/7/2 18:06
 */

/**
 * 为了保障通信安全，我们会将想要发送的信息进行加密处理:
 * ①现在同学A接收到了同学B发过来的加密文件，已知加密方式是将每个字符对应码表中数字的值+3.
 * ②)请你将如下内容进行解密并打印在控制台
 * ③在当前项目下创建b.txt文件，文件中内容为:L#oryh#|rx#arw#iru#zkr#rx#duh/exw#iru#zkr#L#dp#zlwk#lrx
 */
public class Test2
    {
        public static void main(String[] args) throws Exception
            {
                InputStream fis = new FileInputStream("file-io-app/src/b.txt");

                int b;
                while ((b = fis.read()) != -1)
                    {
                        System.out.print((char) (b - 3));
                    }
                fis.close();
            }
    }
