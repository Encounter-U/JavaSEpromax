package com.Encounter.d1_polymorphism;

/**
 * @author Encounter
 * @date 2024/6/18 18:37
 */
public class Test2
    {
        public static void main(String[] args)
            {
                //People p1=new Teacher();
//                People p1=new Student();
//
//                p1.run();
                Teacher t=new Teacher();
                go(t);
                Student s=new Student();
                go(s);
            }
        public static void go(People p)
            {
                System.out.println("========");
                p.run();
//                t.teach();//多态下不能直接读取到子类独有的方法
//                t.study();
                /*Teacher t=(Teacher)p;
                t.teach();
                Student s=(Student)p;
                s.study();*/
                //先判断传入的参数是否为相应的类型
                if (p instanceof Student)
                    {
                        Student s=(Student) p;
                        s.study();
                    }
                else if (p instanceof Teacher)
                    {
                        Teacher s=(Teacher) p;
                        s.teach();
                    }
                System.out.println("========");
            }
    }
