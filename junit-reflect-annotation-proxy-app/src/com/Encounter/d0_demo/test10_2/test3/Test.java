package com.Encounter.d0_demo.test10_2.test3;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Encounter
 * @date 2024/07/19 19:03<br/>
 * 设计一个程序，完成以下功能<br/>
 * 1.在项目下创建一个conf.properties文件<br/>
 * 2.创建一个Person类，有两个String类型的属性name，age，生成setter和getter方法，并重写toString方法<br/>
 * 3.创建一个测试类，解析配置文件，利用反射技术创建className这一项指定的对象，并将配置文件中的内容赋值到该对象
 */
public class Test
    {
        public static void main(String[] args) throws Exception
            {
                //解析.properties文件
                Properties properties=new Properties();
                properties.load(new FileReader("junit-reflect-annotation-proxy-app/src/com/Encounter/d0_demo/test10_2/test3/conf.properties"));
                String className = properties.getProperty("className");
                String name = properties.getProperty("name");
                int age = Integer.parseInt(properties.getProperty("age"));
                
                Class c = Class.forName(className);
                //获取set方法
                Method setName = c.getDeclaredMethod("setName", String.class);
                Method setAge = c.getDeclaredMethod("setAge", int.class);
                
                //赋值
                Person person =(Person) c.newInstance();
                setName.invoke(person,name);
                setAge.invoke(person,age);
                
                //输出
                System.out.println(person);
                
            }
    }
