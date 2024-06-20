package com.Encounter.demo.picture;

/**
 * @author Encounter
 * @date 2024/6/18 20:46
 */

/**
 * ① 定义一个图形类Picture(抽象类)，需包含属性:边长(sideLength)、边数(sideCount)，需包含抽象方法:求周长getPerimeter方法
 * 求面积getArea方法、显示图形信息show方法
 * ② 定义图形类Picture的两个子类:圆形类Circle 和 矩形类Rect
 * 圆形类Cire需包含属性:圆心x (centerX)、圆心y(centerY)、半径(radius)，重写求周长、求面积方法、显示信息方法,矩形类Rect需包含
 * 属性:长(length)、宽(width)，重写求周长、求面积方法、显示信息方法
 * ③ 定义测试类:测试方法中用多态的形式创建圆形类Cirle对象 和 矩形类Rect对象，分别调用show方法显示信息
 */
public class Test
    {
        public static void main(String[] args)
            {
                Picture p1=new Circle(0,0,13,14,2);
                p1.getPerimeter();
                p1.getArea();
                p1.show();
                System.out.println();
                Picture p2=new Rect(4,4,4,4);
                p2.getPerimeter();
                p2.getArea();
                p2.show();
            }
    }
