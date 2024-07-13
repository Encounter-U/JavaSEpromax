package com.Encounter.d0_demo.test5_5.shoppingOS;

/**
 * @author Encounter
 * @date 2024/6/28 21:01
 */

/**
 * 需要实现一个购物车功能。请设计一个ava程序，使用Map集合作为购物车的数据结构，并实现以下功能:
 * ①使用HashMap作为购物车的实现类.
 * ②封装一个商品类，包含商品的名称、价格和数量等属性。
 * ③提供添加商品到购物车的方法，根据商品名称作为键，商品对象作为值存储到Map中,
 * 4)提供展示购物车所有商品的方法，遍历Map集合，输出每个商品的名称、价格和数量
 * ⑤)提供计算购物车总价的方法，遍历Map集合，累加每个商品的价格乘以数量，并返回总价。
 */
public class Test
    {
        public static void main(String[] args)
            {
                GoodsOperator go = new GoodsOperator();
                go.addGoods("苹果", new Goods("苹果", 50, 10));
                go.addGoods("香蕉", new Goods("香蕉", 10, 50));
                go.addGoods("榴莲", new Goods("榴莲", 5, 100));
                go.show();
                go.sumPrice();
            }
    }
