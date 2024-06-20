package com.Encounter.demo.animal;

/**
 * @author Encounter
 * @date 2024/6/18 17:39
 */

/**
 * 定义一个动物类，有品种、年龄(age)等属性，用吃食物等行为
 * ①在动物类的子类，鲸鱼和狗(需重写吃食物的方法)
 * ②)定义一个测试类，创建鲸鱼和狗对象，并分别调用eat方法，把信息输出到控制台
 * 3岁大的虎鲸正在吃东西
 * 2岁大的柴犬正在吃东西
 */
public class Test
    {
        public static void main(String[] args)
            {
                killerWhale k = new killerWhale(3);
                k.eat();
                Dog d = new Dog(2);
                d.eat();
            }
    }
