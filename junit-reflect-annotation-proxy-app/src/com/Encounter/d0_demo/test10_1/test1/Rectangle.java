package com.Encounter.d0_demo.test10_1.test1;

/**
 * @author Encounter
 * @date 2024/07/19 14:54<br/>
 * 编写一个JUnit测试用例，测试一个计算矩形面积的方法
 * ①)编写一个JUnit测试类RectangleTest，使用Jnit的注解和断言测试Rectangle类的getArea方法
 * ②使用@Test注解标记测试方法。使用@BeforeClass注解修饰静态的初始化方法设置长方形的长和宽,
 * ③使用assertEquals断言验证计算结果是否正确,
 * Rectangle 代码如下:
 */
public class Rectangle
    {
        private Integer width;
        private Integer height;
        
        public Rectangle(Integer width, Integer height)
            {
                this.width = width;
                this.height = height;
            }
        
        public Integer getArea()
            {
                return width * height;
            }
    }
