package com.Encounter.d7_method_references;

import com.Encounter.d5_arrays.Student;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Encounter
 * @date 2024/6/22 11:23
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Student[] students = new Student[4];
                students[0] = new Student("路明非", 175, 22);
                students[1] = new Student("楚子航", 180, 23);
                students[2] = new Student("凯撒", 180, 23);
                students[3] = new Student("上杉绘梨衣", 171, 22);

                //原始写法
                Arrays.sort(students, new Comparator<Student>()
                    {
                        @Override
                        public int compare(Student o1, Student o2)
                            {
                                return Double.compare(o1.getHeight(), o2.getHeight());//升序
                            }
                    });

                //使用Lambda简化后的形式
                //Arrays.sort(students, ((o1, o2) -> o1.getAge() - o2.getAge()));

                //Arrays.sort(students, ((o1, o2) -> CompareByData.compareByAge(o1, o2)));//升序

                //静态方法引用
                Arrays.sort(students, CompareByData::compareByAge);//升序

                //实例方法引用
                Arrays.sort(students,new CompareByData()::compareByAgeDesc);//降序


                System.out.println(Arrays.toString(students));
            }
    }
