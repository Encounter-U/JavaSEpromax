package com.Encounter.demo.cylinder;

/**
 * @author Encounter
 * @date 2024/6/19 16:15
 */

/**
 * 按如下要求编写Java程序:
 * ① 定义接口A，里面包含值为3.14的常量P|和 抽象方法double area0);计算面积
 * ②) 定义接口B，里面包含 抽象方法void setColor(String c);设置颜色
 * ③ 定义接口C，该接口继承了接口A和B，里面包含 抽象方法 double volume();计算体积
 * ④定义圆柱体类Cyinder实现接口C，该类中包含三个成员变量:底圆半径radius、圆柱体的高height、颜色color，并进行方法重写"(area方法
 * 计算圆柱体的侧面积，setColor方法设置颜色，volume方法计算圆柱体的体积)
 * ⑤)定义测试类及测试方法，创建Cylinder对象，打印该圆柱体对象的侧面积、体积及颜色
 * 提示:圆柱体的侧面积计算公式为:S侧=2mrh 圆柱体的体积计算公式为:V=Tr2h
 */
public class Test
    {
        public static void main(String[] args)
            {
                Cylinder c=new Cylinder(3,4,"红色");
                System.out.println(c.area());
                System.out.println(c.volume());
                c.setColor("蓝色");
                System.out.println(c.getColor());
            }
    }
