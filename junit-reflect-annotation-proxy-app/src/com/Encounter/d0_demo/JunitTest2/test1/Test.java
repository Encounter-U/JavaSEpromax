package com.Encounter.d0_demo.JunitTest2.test1;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Encounter
 * @date 2024/07/20 13:15<br/>
 * 在班级的花名册中有学生的姓名和年龄信息，现在要求我们将花名册中学生的信息按照一定的规则排序，请按照以下要求，完成该功能.<br/>
 * ①创建一个b.txt文件，在里面填充一些学生信息:张三，23;李四，19;王五17;赵六，22;每个学生信息单独一行<br/>
 * ②定义一个学生类，属性为name，age。生成setter和getter方法，有无参数构造方法<br/>
 * ③创建一个测试类，读取当前文件，并将学生信息重新排序后写入b.txt
 */
public class Test
    {
        //定义文件位置
        private static String filePath = "junit-reflect-annotation-proxy-app/src/com/Encounter/d0_demo/JunitTest2/test1/b.txt";
        //定义集合存入学生数据
        private static List<Student> students = new ArrayList<>();
        
        public static void main(String[] args) throws FileNotFoundException
            {
                try (
                        BufferedReader br = new BufferedReader(new FileReader(filePath));
                )
                    {
                        String line;//记录读取的每行数据
                        while ((line = br.readLine()) != null)
                            {
                                //字符串最后一位是分号，去掉后以逗号隔开并存入数组
                                String[] split = line.substring(0, line.length() - 1).split(",");
                                String name = split[0];
                                int age = Integer.parseInt(split[1]);
                                students.add(new Student(name, age));//存入学生信息
                            }
                        //开始排序，按照年龄升序排序
                        students.sort(Comparator.comparingInt(Student::getAge));
                        System.out.println(students);
                        
                    }
                catch (IOException e)
                    {
                        throw new RuntimeException(e);
                    }
                
                //使用打印流写入文件
                try (PrintStream ps = new PrintStream(filePath))
                    {
                        //使用打印流重新写入文件
                        for (Student student : students)
                            {
                                ps.println(student.getName() + "," + student.getAge() + ";");
                            }
                    }
            }
    }
