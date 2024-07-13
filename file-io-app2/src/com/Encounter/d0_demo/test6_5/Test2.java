package com.Encounter.d0_demo.test6_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Encounter
 * @date 2024/7/3 21:29<p/>
 * 设计一个程序，模拟随机点名器
 * ①创建一个stu.txt，在文件中填入一些学生名字，每个学生名字单独一行
 * ②在主方法中读取文件内容，将学生信息保存到集合中
 * ③生成一个随机数，作为集合元素的索引
 * ④)根据该索引从集合中获取一个员工姓名，并将该员工从集合中移除掉
 * ⑤将集合中剩余的员工姓名通过BufferedWriter再一次写入到stu.txt文件中
 */
public class Test2
    {
        public static void main(String[] args)
            {
                try (BufferedReader br = new BufferedReader(new FileReader("file-io-app2/src/stu.txt"));
                     BufferedWriter bw = new BufferedWriter(new FileWriter("file-io-app2/src/stu.txt", true)))
                    {
                        Random r = new Random();
                        List<String> names = new ArrayList<>();
                        String line;
                        while ((line = br.readLine()) != null)
                            {
                                names.add(line);
                            }

                        //生成随机索引显示员工姓名并删除
                        int index = r.nextInt(names.size());
                        System.out.println("员工姓名：" + names.get(index));
                        names.remove(index);
                        System.out.println("删除成功！");

                        //再次写入
                        for (String name : names)
                            {
                                bw.newLine();
                                bw.write(name);
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
