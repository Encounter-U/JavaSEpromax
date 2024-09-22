package com.Encounter.d2_reflect;

/**
 * @author Encounter
 * @date 2024/07/19 13:04<br/>
 * 获取Class对象
 */
public class Test1Class
    {
        public static void main(String[] args) throws Exception
            {
                Class c1 = Student.class;
                System.out.println(c1.getName());//全类名
                System.out.println(c1.getSimpleName());//简名
                
                Class c2 = Class.forName("com.Encounter.d2_reflect.Student");
                System.out.println(c1==c2);
                
                Student s=new Student();
                Class c3 = s.getClass();
                System.out.println(c3 == c2);
            }
    }
