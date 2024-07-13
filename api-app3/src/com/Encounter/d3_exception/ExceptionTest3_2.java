package com.Encounter.d3_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Encounter
 * @date 2024/6/23 11:01
 */
public class ExceptionTest3_2
    {
        public static void main(String[] args)
            {

                try
                    {
                        test1();
                    }
                catch (Exception e)
                    {
                        System.out.println("操作有问题");
                        e.printStackTrace();
                    }

            }

        public static void test1() throws Exception
            {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date d = sdf.parse("2024-06-23 10:32:05");
                System.out.println(d);


                test2();
            }

        public static void test2() throws FileNotFoundException
            {
                //读取文件的
                InputStream is = new FileInputStream("D:\\图片\\preview.jpg");
            }
    }
