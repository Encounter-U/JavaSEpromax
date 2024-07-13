package com.Encounter.d4_collection_set;

/**
 * @author Encounter
 * @date 2024/6/26 13:13
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 目标：掌握TreeSet集合的使用
 */
public class SetTest4
    {
        public static void main(String[] args)
            {
                Set<Integer> set = new TreeSet<>();
                set.add(19);
                set.add(1);
                set.add(6);
                set.add(1);
                System.out.println(set);

                //自定义类型默认无法排序
                /*Set<Student> students = new TreeSet<>(new Comparator<Student>()
                    {
                        @Override
                        public int compare(Student o1, Student o2)
                            {
                                return Double.compare(o1.getHeight(), o2.getHeight());
                            }
                    });*/
                //就近选择自带的比较器进行选择
                Set<Student> students = new TreeSet<>(Comparator.comparingDouble(Student::getHeight));
                students.add(new Student("路明非", 22, 178));
                students.add(new Student("楚子航", 23, 180));
                students.add(new Student("夏弥", 23, 170));
                students.add(new Student("楚子航", 23, 180));
                System.out.println(students);

            }
    }
