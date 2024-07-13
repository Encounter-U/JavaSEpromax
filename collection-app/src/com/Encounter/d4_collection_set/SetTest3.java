package com.Encounter.d4_collection_set;

/**
 * @author Encounter
 * @date 2024/6/26 13:13
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 目标：自定义类型的对象，比如两个内容一样的学生对象，如果让HashSet集合能够去重复
 */
public class SetTest3
    {
        public static void main(String[] args)
            {
                Set<Student> students=new HashSet<>();
                Student s1=new Student("路明非",22,178);
                Student s2=new Student("楚子航",23,180);
                Student s3=new Student("夏弥",23,170);
                Student s4=new Student("楚子航",23,180);
                System.out.println(s2.hashCode());
                System.out.println(s4.hashCode());
                students.add(s1);
                students.add(s2);
                students.add(s3);
                students.add(s4);
                System.out.println(students);

            }
    }
