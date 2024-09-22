package com.Encounter.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author Encounter
 * @date 2024/07/19 16:33<br/>
 * 目标：掌握获取类的成员方法，并对其进行操作
 */
public class Test4Method
    {
        @Test
        public void testGetMethods() throws Exception
            {
                //1.反射第一步，先得到Class对象
                Class c = Cat.class;
                //2.获取类的全部成员方法
                Method[] methods = c.getDeclaredMethods();
                //3.遍历该数组中的每个方法对象
                for (Method method : methods)
                    {
                        System.out.println(method.getName()
                                + "-->" + method.getParameterCount()
                                + "-->" + method.getReturnType());
                    }
                //4.获取某个方法对象
                Method run = c.getDeclaredMethod("run");//run方法无参数且无重载
                System.out.println(run.getName()
                        + "-->" + run.getParameterCount()
                        + "-->" + run.getReturnType());
                
                Method eat = c.getDeclaredMethod("eat", String.class);//eat方法有参数要声明参数类型
                System.out.println(eat.getName()
                        + "-->" + eat.getParameterCount()
                        + "-->" + eat.getReturnType());
                
                //调用方法
                Cat cat=new Cat();
                run.setAccessible(true);//禁止检查访问权限
                System.out.println(run.invoke(cat));//无返回值，所以输出null
                eat.setAccessible(true);
                System.out.println(eat.invoke(cat,"String.class"));//无返回值，所以输出null
            }
    }
