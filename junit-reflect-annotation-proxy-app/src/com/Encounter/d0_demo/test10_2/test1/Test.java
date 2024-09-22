package com.Encounter.d0_demo.test10_2.test1;

import java.lang.reflect.Field;

/**
 * @author Encounter
 * @date 2024/07/19 18:48<br/>
 * 在开发过程中，我们会需要获取一个类中的成员属性，并且知道该属性的类型，请使用反射完成该功能:
 * ①定义一个Person类，定义两个私有属性name，age
 * ②)在测试类中获取Person类中的成员属性 并将 成员属性和类型打印在控制台
 */
public class Test
    {
        public static void main(String[] args)
            {
                Class c = Person.class;
                Field[] fields = c.getDeclaredFields();
                for (Field field : fields)
                    {
                        System.out.println(field.getName() + "-->" + field.getType());
                    }
            }
    }
