package com.Encounter.d8_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Encounter
 * @date 2024/6/29 13:31
 */
public class StreamTest4
    {
        public static void main(String[] args)
            {
                List<Student> students = new ArrayList<>();
                Collections.addAll(students,
                        new Student("路明非", 22, 178.6),
                        new Student("路明非", 22, 178.6),
                        new Student("楚子航", 23, 181.6),
                        new Student("夏弥", 30, 166.6),
                        new Student("上杉绘梨衣", 18, 165.6),
                        new Student("零", 22, 168.6)
                );

                //需求1：计算出身高超过175的有几人
                long count = students.stream().filter(s -> s.getHeight() > 175).count();
                System.out.println(count);

                //需求2：找出身高最高的并输出
                Student max = students.stream().max(Comparator.comparingDouble(Student::getHeight)).get();
                System.out.println(max);

                //需求3：找出最矮的
                Student student = students.stream().min(Comparator.comparingDouble(Student::getHeight)).get();
                System.out.println(student);

                //需求4：找出超过170的并放入一个新集合并输出
                //流只能收集一次
                Stream<Student> studentStream = students.stream().filter(s -> s.getHeight() > 170);
                List<Student> collect1 = studentStream.collect(Collectors.toList());
                System.out.println(collect1);

                /*Set<Student> collect2 = studentStream.collect(Collectors.toSet());
                System.out.println(collect2);*/

                //需求5：找出超过170的，把姓名和身高超过存入到Map集合并返回
                Map<String, Double> collect = students.stream().filter(s -> s.getHeight() > 170)
                        .distinct()
                        .collect(Collectors.toMap(Student::getName, Student::getHeight));
                System.out.println(collect);


                //Object[] array = students.stream().filter(s -> s.getHeight() > 170).toArray();
                //Student[] array = students.stream().filter(s -> s.getHeight() > 170).toArray(length->new Student[length]);
                Student[] array = students.stream().filter(s -> s.getHeight() > 170).toArray(Student[]::new);
                System.out.println(Arrays.toString(array));
            }
    }
