package com.Encounter.d0_demo.afterClassExercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Encounter
 * @date 2024/6/21 15:36
 */

/**
 * 使用SimpleDateFormat类把2018-03-04转换为2018年03月04日
 */
public class Test2
    {
        public static void main(String[] args) throws ParseException
            {
                String str="2018-03-04";
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                Date parse = sdf.parse(str);
                SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
                System.out.println(sdf2.format(parse));
            }
    }
