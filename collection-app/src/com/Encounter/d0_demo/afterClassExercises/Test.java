package com.Encounter.d0_demo.afterClassExercises;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/26 15:38
 */

/**
 * 定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储
 */
public class Test
    {
        public static void main(String[] args)
            {
                Set<Person> personSet=new HashSet<>();
                personSet.add(new Person("路明非",22));
                personSet.add(new Person("楚子航",23));
                personSet.add(new Person("路明非",22));
                System.out.println(personSet);
            }

    }
