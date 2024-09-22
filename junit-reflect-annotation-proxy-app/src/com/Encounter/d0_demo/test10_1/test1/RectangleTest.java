package com.Encounter.d0_demo.test10_1.test1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 编写一个JUnit测试用例，测试一个计算矩形面积的方法
 * ①)编写一个JUnit测试类RectangleTest，使用Jnit的注解和断言测试Rectangle类的getArea方法
 * ②使用@Test注解标记测试方法。使用@BeforeClass注解修饰静态的初始化方法设置长方形的长和宽,
 * ③使用assertEquals断言验证计算结果是否正确
 */
public class RectangleTest
    {
        private static Rectangle rectangle;
        
        //初始化
        @BeforeClass
        public static void init()
            {
                rectangle = new Rectangle(5, 10);
            }
        
        @Test
        public void testGetArea()
            {
                int area = rectangle.getArea();
                Assert.assertEquals("程序有BUG",50,area);
            }
    }