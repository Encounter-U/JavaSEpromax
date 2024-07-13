package com.Encounter.d6_lambda;

import com.Encounter.d5_arrays.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

/**
 * @author Encounter
 * @date 2024/6/22 10:57
 */


public class LambdaTest2
    {
        public static void main(String[] args)
            {

                /**
                 * 简化前
                 */
        /*        double[] d = new double[]{16.0, 12.3, 11.5};
                Arrays.setAll(d, new IntToDoubleFunction()
                    {
                        @Override
                        public double applyAsDouble(int value)
                            {
                                return d[value] * 0.8;
                            }
                    });
                System.out.println(Arrays.toString(d));

                System.out.println("===========================================");

                Student[] students = new Student[4];
                students[0] = new Student("路明非", 175, 22);
                students[1] = new Student("楚子航", 180, 23);
                students[2] = new Student("凯撒", 180, 23);
                students[3] = new Student("上杉绘梨衣", 171, 22);

                //1.public static void sort(类型[] arr)：对数组进行排序
                Arrays.sort(students);
                System.out.println(Arrays.toString(students));
                Arrays.sort(students, new Comparator<Student>()
                    {
                        @Override
                        public int compare(Student o1, Student o2)
                            {
                                //制定比较规则
                                //约定：左大于右，返回正整数
                                //右大于左，返回负整数
                                //相等，返回0
                                return Double.compare(o1.getHeight(), o2.getHeight());//升序
                                //return Double.compare(o2.getHeight(), o1.getHeight());//降序
                            }
                    });
                System.out.println(Arrays.toString(students));

*/
                /**
                 * 简化后
                 */
                double[] d = new double[]{16.0, 12.3, 11.5};
                Arrays.setAll(d, value -> d[value] * 0.8);
                System.out.println(Arrays.toString(d));

                System.out.println("===========================================");

                Student[] students = new Student[4];
                students[0] = new Student("路明非", 175, 22);
                students[1] = new Student("楚子航", 180, 23);
                students[2] = new Student("凯撒", 180, 23);
                students[3] = new Student("上杉绘梨衣", 171, 22);

                //1.public static void sort(类型[] arr)：对数组进行排序
                Arrays.sort(students);
                System.out.println(Arrays.toString(students));
                Arrays.sort(students, Comparator.comparingDouble(Student::getHeight));
                System.out.println(Arrays.toString(students));
            }
    }


