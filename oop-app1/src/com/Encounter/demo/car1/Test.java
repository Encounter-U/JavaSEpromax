package com.Encounter.demo.car1;

/**
 * @author Encounter
 * @date 2024/6/17 23:03
 */

/**
 * 请使用面向对象的思想，设计自定义类，描述出租车和家用轿车的信息，要求如下。
 * ①分析出租车和家用轿车的公共成员，提取出父类一汽车类(这里父类不写方法，可在学完方法重写后再优化)
 * 分析:
 * 出租车类属性包括:车型，车牌，所属出租公司:方法包括:启动，停止(输出相应对顾客的提醒问候语
 * 家用轿车类属性包括:车型，车牌，车主姓名;方法包括:启动，停止
 * ②利用继承机制，实现出租车类和家用轿车类
 * ③编写测试类，分别测试出租车类和家用轿车类对象的相关方法
 * 4)定义名为car的包存放汽车类，出租车类，家用轿车类和测试类
 * H0-有日A7RRR8HSUMT-
 * 迎餐坐传智播察的车牌号为京A，18888的SU型出租车，请系好安全带
 * 传智播客的车牌县为京A，18888的SUv型中相车，下车同请记得带好随身物导
 */
public class Test
    {
        public static void main(String[] args)
            {
                //轿车
                Sedan sedan=new Sedan("SUV","京A.J8888","赵云");
                sedan.start();
                sedan.stop();

                //出租车
                Taxi taxi=new Taxi("SUV","京A.J8888","传智播客");
                taxi.start();
                taxi.stop();
            }
    }
