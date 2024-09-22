package com.Encounter.d2_reflect;

/**
 * @author Encounter
 * @date 2024/07/19 17:01<br/>
 * 目标：使用反射技术：设计一个保存对象的简易版框架
 */
public class Test5Frame
    {
        public static void main(String[] args) throws Exception
            {
                Student s1 = new Student("路明非", 22, '男', 179, "Dragon");
                Teacher t1 = new Teacher("昂热", 9999999);
                
                //需求：把任意对象的字段名和其对应的值等信息，保存到文件中去
                ObjectFrame.saveObject(s1);
                ObjectFrame.saveObject(t1);
                
            }
    }
