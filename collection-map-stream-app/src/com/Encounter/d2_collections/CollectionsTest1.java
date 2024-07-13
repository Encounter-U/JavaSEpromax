package com.Encounter.d2_collections;

/**
 * @author Encounter
 * @date 2024/6/26 18:29
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 掌握Collections集合工具类的使用<br/>
 * 1.public static <T> boolean addAll(Collection<? super T> c,T...elements)：为集合批量添加数据<br/>
 * 2.public static void shuffle(List<?> list)：打乱List集合中的元素顺序<br/>
 * 3.public static <T> void sort(List<T> list)：对list集合中的元素进行升序排序<br/>
 * 4.public static <T> void sort(List<T> list, Comparator<? super T> c)：对List集合中元素，按照比较器对象的规则进行排序
 */
public class CollectionsTest1
    {
        public static void main(String[] args)
            {
                //1.public static <T> boolean addAll(Collection<? super T> c,T...elements)：为集合批量添加数据
                List<String> names = new ArrayList<>();
                Collections.addAll(names, "路明非", "楚子航", "夏弥", "上杉绘梨衣");
                System.out.println(names);

                //2.public static void shuffle(List<?> list)：打乱List集合中的元素顺序
                Collections.shuffle(names);
                System.out.println(names);

                //3.public static <T> void sort(List<T> list)：对list集合中的元素进行升序排序
                List<Integer> num = new ArrayList<>();
                Collections.addAll(num, 3, 5, 4, 2, 1, 5, 6, 3);
                Collections.sort(num);
                System.out.println(num);

                List<Student> students = new ArrayList<>();
                students.add(new Student("路明非", 22, 178));
                students.add(new Student("楚子航", 23, 180));
                students.add(new Student("夏弥", 24, 170));
                students.add(new Student("上杉绘梨衣", 18, 169));
                Collections.sort(students);
                System.out.println(students);

                //4.public static <T> void sort(List<T> list, Comparator<? super T> c)：对List集合中元素，按照比较器对象的规则进行排序
                Collections.sort(students, Comparator.comparingDouble(Student::getHeight));//按照就近的比较器排序
                System.out.println(students);
            }
    }
