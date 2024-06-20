package com.Encounter.demo.Manager;

/**
 * @author Encounter
 * @date 2024/6/17 22:14
 */

/**
 * 模拟教学管理系统师生信息。
 * ①定义Person类包含属性:姓名、年龄;和成员方法:getXxx方法，setXxx方法，显示基本信息showMsg方法
 * ②定义Teacher类，继承Person包含属性:学科;和成员方法:getXxx方法，setXxx方法，讲课方法
 * ③定义Student类，继承Person包含属性:分数和成员方法:qetXxx方法，setXxx方法，考试方法
 * ④)最后定义测试类，输出案例如图:
 * 王小平老师,讲授Java课
 * 李小乐同学,考试得了:90分
 */
public class Test
    {
        public static void main(String[] args)
            {
                Teacher t = new Teacher();
                t.setName("王小平");
                t.setAge(30);
                t.setObject("Java");
                t.showMsg();
                t.teach();

                Student s = new Student();
                s.setName("李小乐");
                s.setAge(18);
                s.setScore(99);
                s.showMsg();
                s.test();
            }
    }
