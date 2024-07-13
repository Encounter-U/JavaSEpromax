package com.Encounter.d1_properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/7/13 16:32<p/>
 * 目标：掌握使用Properties类读取属性文件中的键值对信息
 */
public class PropertiesTest1
    {
        public static void main(String[] args)
            {
                try (FileReader reader = new FileReader("properties-xml-log-app/src/users.properties"))
                    {
                        //1.创建一个Properties的对象出来(键值对集合，空容器)
                        Properties p = new Properties();
                        System.out.println(p);

                        //2.开始加载属性文件中的键值对数据到Properties对象中去
                        p.load(reader);
                        System.out.println(p);

                        //3.根据键取值
                        System.out.println(p.getProperty("路明非"));

                        //4.遍历全部的键和值
                        Set<String> names = p.stringPropertyNames();
                        for (String name : names)
                            {
                                System.out.println(name + ":" + p.getProperty(name));
                            }

                        //使用lambda表达式
                        p.forEach((k,v)-> System.out.println(k+":"+v));
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
