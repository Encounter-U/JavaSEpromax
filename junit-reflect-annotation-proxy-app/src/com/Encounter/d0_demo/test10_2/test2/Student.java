package com.Encounter.d0_demo.test10_2.test2;

/**
 * @author Encounter
 * @date 2024/07/19 18:51<br/>
 * 动态调用的好处就是可以在类不可知的情况下完成编码，而且可以随意更改具体实现的类。请按照如下要求模拟动态调用
 * ①定义一个Student类，类中属性name(String)，age(Int)，并生成setter和getter方法
 * ②在测试类中定义一个学生对象，并对其进行赋值
 * ③)利用反射获取Student的getName方法得到stu的name属性，打印在控制台
 * ④利用反射获取Student的setName方法修改stu的name属性，并将stu打印在控制台
 */
public class Student
    {
        private String name;
        private int age;
        
        public Student()
            {
            }
        
        public Student(String name, int age)
            {
                this.name = name;
                this.age = age;
            }
        
        public String getName()
            {
                return name;
            }
        
        public void setName(String name)
            {
                this.name = name;
            }
        
        public int getAge()
            {
                return age;
            }
        
        public void setAge(int age)
            {
                this.age = age;
            }
        
        @Override
        public String toString()
            {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
    }
