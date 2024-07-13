package com.Encounter.d0_demo.test5_4.educationalSystem;

/**
 * @author Encounter
 * @date 2024/6/26 21:35
 */

/**
 * 学校的教务系统需要处理学生选课情况。需要实现以下功能:
 * ①每个学生可以选择一门或多门课程(使用可变参数)
 * 并将选课信息存储在集合中，
 * ②实现添加选课功能，确保同一门课程不会重复添加。
 * ③实现退选课程功能，学生可以选择退选已选的课程。
 * ④)实现展示学生选课情况的功能，以便学生和教务人员可以查看选课信息.
 * ⑤编写测试方法，测试以上功能
 */
public class Test
    {
        public static void main(String[] args)
            {
                EducationalSystem es=new EducationalSystem();
                es.start();
            }
    }
