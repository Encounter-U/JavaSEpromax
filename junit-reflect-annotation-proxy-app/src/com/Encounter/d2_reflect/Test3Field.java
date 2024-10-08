package com.Encounter.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author Encounter
 * @date 2024/07/19 16:10<br/>
 * 目标：掌握获取类的成员变量，并对其进行操作
 */
public class Test3Field
    {
        @Test
        public void testGetFields() throws Exception
            {
                //1.反射第一步，必须是先得到类的Class对象
                Class c = Cat.class;
                
                //2.获取类的全部成员变量（包括私有成员）
                Field[] fields = c.getDeclaredFields();
                
                //3.遍历该成员数组
                for (Field field : fields)
                    {
                        System.out.println(field.getName() + "-->" + field.getType());
                    }
                
                //4.定位某个成员变量
                Field fName = c.getDeclaredField("name");
                System.out.println(fName.getName() + "-->" + fName.getType());
                
                Field fAge = c.getDeclaredField("age");
                System.out.println(fAge.getName() + "-->" + fAge.getType());
                
                //赋值
                Cat cat = new Cat();
                fName.setAccessible(true);//禁止访问控制权限
                fName.set(cat, "路明非");
                
                //取值
                String name = (String) fName.get(cat);
                System.out.println(name);
                
            }
    }
