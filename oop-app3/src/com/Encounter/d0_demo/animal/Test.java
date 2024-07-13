package com.Encounter.d0_demo.animal;

/**
 * @author Encounter
 * @date 2024/6/20 19:26
 */

/**
 * 定义一个动物类，有品种、年龄(age)等属性，用吃食物等行为
 * ①在动物类的子类，鲸鱼和狗(需重写吃食物的方法)
 * ②定义一个测试类，创建鲸鱼和狗对象，并分别调用eat方法，把信息输出到控制台
 * 3岁大的虎鲸正在吃东西
 * 2岁大的柴犬正在吃东西
 */
public class Test
    {
        public static void main(String[] args)
            {
                Animal whale = new Whale("虎鲸", 3);
                Animal dog = new Dog("柴犬", 2);
                whale.eat();
                dog.eat();
            }
    }
