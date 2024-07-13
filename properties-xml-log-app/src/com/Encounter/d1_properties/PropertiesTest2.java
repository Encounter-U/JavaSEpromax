package com.Encounter.d1_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Encounter
 * @date 2024/7/13 16:48<p/>
 * 目标：掌握把键值对数据存入到属性文件中去
 */
public class PropertiesTest2
    {
        public static void main(String[] args)
            {
                try (FileWriter writer = new FileWriter("properties-xml-log-app/src/users2.properties"))
                    {
                        //1.创建Properties对象出来，先用他存储一些键值对数据
                        Properties p=new Properties();
                        p.setProperty("上杉绘梨衣","FINAL BOSS");
                        p.setProperty("凯撒","ordinary");
                        p.setProperty("零","rightHandMan");

                        //2.把Properties对象中的键值对数据存入到属性文件中去
                        p.store(writer,"存了点其他人物");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
