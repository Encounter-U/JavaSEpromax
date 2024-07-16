package com.Encounter.d0_demo.unitTest.test3;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Encounter
 * @date 2024/7/13 21:13<p/>
 * 为了降低代码的耦合性，我们会将一些信息写在文件中，请按照如下要求模拟该过程<br/>
 * ①在当前项目下创建一个文件c.txt，文件内容如下:<br/>
 * 张三,18<br/>
 * ②定义一个实体类Student，包含属性name(String) age (lnt)<br/>
 * ③创建一个测试类，在测试类中读取c.txt文件中的内容，在测试类中创建Student对象，并将来自文件中的信息进行赋值，打印学生对象
 */
public class Test
    {
        public static void main(String[] args)
            {
                try (BufferedReader br = new BufferedReader(new FileReader("properties-xml-log-app/src/com/Encounter/d0_demo/unitTest/test3/c.txt")))
                    {
                        String s = br.readLine();
                        String[] split = s.split(",");
                        String name = split[0];
                        int age = Integer.parseInt(split[1]);
                        Student student = new Student(name, age);
                        System.out.println(student);
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
