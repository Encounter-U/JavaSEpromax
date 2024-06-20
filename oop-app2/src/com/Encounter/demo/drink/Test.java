package com.Encounter.demo.drink;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/18 20:21
 */

/**
 * ①定义一个汽水类Drink(抽象类)，汽水类中有一个味道的方法taste
 * ②定义一个可口可乐类，Coco继承自汽水类，重写父类的taste方法，输出“我是可口可乐，我是甜汽水”
 * ③定义一个盐汽水类SaltDrink继承自汽水类，重写父类的taste方法，输出“我是盐汽水，我是咸的”
 * ④定义一个测试类，提供一个售卖汽水的方法sel，接收用户输入的值，如果是“甜的”，就卖给客户甜的汽水，否则卖给客户咸的汽水
 */
public class Test
    {
        public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("请输入您想要的饮料：");
                sell(sc.next());
            }
        public static void sell(String str)
            {
                if (str.equals("甜的"))
                    new Coco().taste();
                else
                    new SaltDrink().taste();
            }
    }
