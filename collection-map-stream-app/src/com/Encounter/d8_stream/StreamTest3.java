package com.Encounter.d8_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Encounter
 * @date 2024/6/29 11:30
 */
public class StreamTest3
    {
        public static void main(String[] args)
            {
                List<Double> scores = new ArrayList<>();
                Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);

                //需求1：找出成绩大于60的数据，并升序后，再输出
                scores.stream().filter(s -> s > 60).forEach(System.out::println);

                List<Student> students = new ArrayList<>();
                Collections.addAll(students,
                        new Student("路明非", 22, 178.6),
                        new Student("路明非", 22, 178.6),
                        new Student("楚子航", 23, 181.6),
                        new Student("夏弥", 30, 166.6),
                        new Student("上杉绘梨衣", 18, 165.6),
                        new Student("零", 22, 168.6)
                );

                //需求2：找出年龄大于18且小于30的，并按照年龄降序输出
                students.stream().filter(s -> s.getAge() > 18 && s.getAge() < 30).sorted((o1, o2) -> o2.getAge() - o1.getAge())
                                .forEach(System.out::println);

                //需求3：取出身高最高的3名学生并输出
                System.out.println("身高");
                students.stream().sorted(Comparator.comparingDouble(Student::getHeight))
                        .skip(3)
                        .forEach(System.out::println);
                System.out.println();

                //需求4：取出身高倒数的2名学生并输出
                System.out.println("身高");
                students.stream().sorted(Comparator.comparingDouble(Student::getHeight))
                        .limit(2)
                        .forEach(System.out::println);
                System.out.println();

                //需求5：找出身高超过168的学生叫什么名字，要求去除重复的名字并输出
                students.stream().filter(s -> s.getHeight() > 168.0)
                        .map(Student::getName)
                        .distinct()
                        .forEach(System.out::println);

                //distinct自定义类型对象去重复需要重写hashCode和equals方法
                students.stream().filter(s -> s.getHeight() > 168.0)
                        .distinct()
                        .forEach(System.out::println);

                //concat
                Stream<String> str1 = Stream.of("路明非", "楚子航");
                Stream<String> str2 = Stream.of("上杉绘梨衣", "夏弥");
                Stream<String> concat = Stream.concat(str1, str2);
                concat.forEach(System.out::println);
            }
    }
