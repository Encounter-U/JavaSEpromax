package com.Encounter.d0_demo.afterClassExercises.test1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Encounter
 * @date 2024/6/22 16:28
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Student[] students = {
                        new Student("Tom", 20),
                        new Student("Jerry", 18),
                        new Student("Lily", 19),
                        new Student("Lucy", 22),
                        new Student("kevin", 21)};
                //Arrays.sort(students, (o1,  o2)->o1.getAge().compareTo(o2.getAge()));
                Arrays.sort(students, Student::compareByAge);
                System.out.println(Arrays.toString(students));
            }
    }
