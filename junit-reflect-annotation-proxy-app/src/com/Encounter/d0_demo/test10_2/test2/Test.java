package com.Encounter.d0_demo.test10_2.test2;

import java.lang.reflect.Method;

/**
 * @author Encounter
 * @date 2024/07/19 18:52<br/>
 * 动态调用的好处就是可以在类不可知的情况下完成编码，而且可以随意更改具体实现的类。请按照如下要求模拟动态调用
 * ①定义一个Student类，类中属性name(String)，age(Int)，并生成setter和getter方法
 * ②在测试类中定义一个学生对象，并对其进行赋值
 * ③)利用反射获取Student的getName方法得到stu的name属性，打印在控制台
 * ④利用反射获取Student的setName方法修改stu的name属性，并将stu打印在控制台
 */
public class Test
    {
        public static void main(String[] args) throws Exception
            {
                Student student = new Student("路明非", 22);
                Class c = Student.class;
                //获取姓名
                Method getName = c.getDeclaredMethod("getName");
                System.out.println(getName.invoke(student));
                //修改姓名
                Method setName = c.getDeclaredMethod("setName", String.class);
                setName.invoke(student, "楚子航");
                //打印学生对象
                System.out.println(student);
                
            }
    }
