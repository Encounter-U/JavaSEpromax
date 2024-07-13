package com.Encounter.d0_demo.Test4_1.test2;

/**
 * @author Encounter
 * @date 2024/6/23 13:41
 */

/**
 * 现在老师要统计学生信息，已知该班学生年龄在18-25之间，如果不在范围内，则输入错误，请编写代码模拟该过程
 * ①创建一个学生类(name，age)，对学生的年龄赋值进行限制，如果输入的学生年龄不在范围内，则抛出异常
 * ②在测试类中完成创建学生对象，并对学生对象进行赋值，对学生的年龄输入一个非法数值，查看控制台输出
 */
public class Test2
    {
        public static void main(String[] args)
            {
                Student s=new Student("路明非",26);
            }
    }
