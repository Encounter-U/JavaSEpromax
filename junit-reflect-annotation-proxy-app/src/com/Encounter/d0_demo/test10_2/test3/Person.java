package com.Encounter.d0_demo.test10_2.test3;

/**
 * @author Encounter
 * @date 2024/07/19 19:00<br/>
 *  1.在项目下创建一个conf.properties文件<br/>
 *  2.创建一个Person类，有两个String类型的属性name，age，生成setter和getter方法，并重写toString方法<br/>
 *  3.创建一个测试类，解析配置文件，利用反射技术创建className这一项指定的对象，并将配置文件中的内容赋值到该对象
 */
public class Person
    {
        private String name;
        private int age;
        
        public Person()
            {
            }
        
        public Person(String name, int age)
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
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
    }
