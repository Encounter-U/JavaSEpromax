package com.Encounter.d0_demo.JunitTest2.test1;

/**
 * @author Encounter
 * @date 2024/07/20 13:11<br/>
 * 在班级的花名册中有学生的姓名和年龄信息，现在要求我们将花名册中学生的信息按照一定的规则排序，请按照以下要求，完成该功能.<br/>
 * ①创建一个b.txt文件，在里面填充一些学生信息:张三，23;李四，19;王五17;赵六，22;每个学生信息单独一行<br/>
 * ②定义一个学生类，属性为name，age。生成setter和getter方法，有无参数构造方法<br/>
 * ③创建一个测试类，读取当前文件，并将学生信息重新排序后写入b.txt
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
