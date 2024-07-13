package com.Encounter.d6_generics_class;

/**
 * @author Encounter
 * @date 2024/6/20 16:19
 */

/**
 * 掌握泛型类的定义和使用
 */
public class Test
    {
        public static void main(String[] args)
            {
                MyArrayList<String> list = new MyArrayList<>();
                list.add("e");
                System.out.println(list.get(0));

                MyClass2<String,String> myClass2=new MyClass2<>();


                MyClass3<Cat> myClass3=new MyClass3<>();
            }
    }
