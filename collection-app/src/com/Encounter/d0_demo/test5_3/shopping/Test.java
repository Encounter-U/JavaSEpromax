package com.Encounter.d0_demo.test5_3.shopping;

/**
 * @author Encounter
 * @date 2024/6/26 16:22
 */

/**
 * 实现电商平台的用户购物车。购物车中存储了用户选购的商品信息(字符串表示)
 * 您需要实现以下功能:
 * ①将用户的购物车中的商品信息存储在一个Set集合中，确保每个商品只出现一次。
 * ②实现添加商品到购物车的功能，确保同一商品不会重复添加。
 * ③实现从购物车中移除商品的功能，用户可以选择要移除的商品。
 * 4)实现展示购物车中的所有商品的功能，以便用户可以查看他们已选择的商品。
 * ⑤)创建main方法测试以上方法
 */
public class Test
    {
        public static void main(String[] args)
            {
                Operator o=new Operator();
                o.addGoods(new Goods("苹果",13.0));
                o.addGoods(new Goods("苹果",13.0));
                o.addGoods(new Goods("香蕉",13.0));

                o.deleteByName("香蕉");
                o.deleteByName("榴莲");

                o.show();
            }
    }
