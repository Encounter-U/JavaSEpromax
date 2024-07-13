package com.Encounter.d0_demo.shoppingCart;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/20 21:18
 */

/**
 * 设计一个购物车系统，其中涉及到以下两个类:
 * Product类，表示一个商品，包含商品的编号(id)、名称(name)、价格(price)等属性;
 * ShoppingCart类，表示一个购物车，包含多个商品(Product对象)
 * 请完成以下任务:
 * ①在Product类中重写equals方法，判断两个商品是否相同时，只需要比较它们的编号id。
 * ②在Product类中重写toString方法，使得打印出一个Product对象时，输出该商品的编号、名称、价格等信息
 * ③在Product类中实现Cloneable接口，并重写clone方法，使得可以复制一个Product对象
 * ④在ShoppingCart类中实现以下方法:
 * void addProduct(Product product):向购物车中添加一个商品;
 * void removeProduct(Product product):从购物车中移除一个商品:
 * double calculateTotalPrice0:计算购物车中所有商品的总价。
 * ⑤新建一个测试类
 * 1.测试自定义equals方法
 * 2.测试自定义toString方法
 * 3.测试clone方法
 * 4.测试添加方法
 * 5.测试删除方法
 */
public class Test
    {
        public static void main(String[] args) throws CloneNotSupportedException
            {
                Product p1 = new Product(1, "火龙果", 1.5);
                Product p2 = new Product(1, "榴莲", 1.2);
                Product p3 = new Product(2, "苹果", 0.5);
                ArrayList<Product> products = new ArrayList<>();
                ShoppingCart sc = new ShoppingCart(products);
                sc.addProduct(p1);
                sc.addProduct(p2);
                sc.addProduct(p3);
                System.out.println("测试equals：");
                System.out.println("p1与p2：" + p1.equals(p2));
                System.out.println("p1与p3：" + p1.equals(p3));
                System.out.println();

                System.out.println("测试toString：");
                System.out.println(p1.toString());
                System.out.println(p2.toString());
                System.out.println(p3.toString());
                System.out.println();

                System.out.println("测试clone：");
                Product p4 = (Product) p1.clone();
                System.out.println("比较p1与p4：" + p1.equals(p4));
                System.out.println();

                System.out.println("测试添加：");
                System.out.println("添加前："+sc.getProducts());
                sc.addProduct(p4);
                System.out.println("添加后："+sc.getProducts());
                System.out.println();

                System.out.println("测试删除：");
                sc.removeProduct(p4);
                System.out.println("删除后："+sc.getProducts());
                System.out.println();

                System.out.println("计算总价：");
                System.out.println("总价为："+sc.calculateTotalPrice());
            }
    }
