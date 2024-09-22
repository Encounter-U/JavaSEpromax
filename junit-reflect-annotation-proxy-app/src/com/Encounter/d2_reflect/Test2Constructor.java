package com.Encounter.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author Encounter
 * @date 2024/07/19 14:24<br/>
 * 目标：掌握获取类的构造器，并对其进行操作
 */
public class Test2Constructor
    {
        @Test
        public void testGetConstructor()
            {
                //1.反射第一步：必须先得到这个类的Class对象
                Class c = Cat.class;
                //2.获取类的全部构造器
                //只能获取public修饰的构造器
                //Constructor[] constructors = c.getConstructors();
                //获取全部构造器，只要存在就能获取
                Constructor[] constructors = c.getDeclaredConstructors();
                //3.遍历数组中的每个构造器对象
                for (Constructor constructor : constructors)
                    {
                        System.out.println(constructor.getName() +
                                "-->" + constructor.getParameterCount());
                    }
            }
        
        @Test
        public void testConstructor() throws Exception
            {
                //1.反射第一步：必须先得到这个类的Class对象
                Class c = Cat.class;
                
                //2.获取某个构造器，无参构造器
                //只能拿public修饰的
                //Constructor constructor=c.getConstructor();
                //只要存在就能拿
                Constructor constructor=c.getDeclaredConstructor();
                System.out.println(constructor.getName() +
                        "-->" + constructor.getParameterCount());
                
                //调用无参构造器
                constructor.setAccessible(true);//禁止检查访问权限
                Cat cat = (Cat) constructor.newInstance();
                System.out.println(cat);
                
                //3.获取有参构造器
                Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class);
                System.out.println(constructor1.getName() +
                        "-->" + constructor1.getParameterCount());
                
                //调用有参构造器
                constructor1.setAccessible(true);
                Cat cat1 = (Cat) constructor1.newInstance("John", 1);
                System.out.println(cat1);
                
            }
    }
