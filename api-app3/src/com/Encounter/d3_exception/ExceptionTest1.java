package com.Encounter.d3_exception;

/**
 * @author Encounter
 * @date 2024/6/23 10:21
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 认识异常
 */
public class ExceptionTest1
    {
        public static void main(String[] args) throws ParseException
            {
                //Integer.valueOf("abc");

                /*int[] arr={1,2,3,};
                System.out.println(arr[5]);*/

                /*try
                    {
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        Date d = sdf.parse("2024-06-23 10:32:05");
                        System.out.println(d);
                    }
                catch (ParseException e)
                    {
                        throw new RuntimeException(e);
                    }*/

                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date d = sdf.parse("2024-06-23 10:32:05");
                System.out.println(d);
            }
    }
