package com.Encounter.d0_demo.shoppingList;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Encounter
 * @date 2024/6/24 16:57
 */

/**
 * 有一份购物清单，包含多个商品，每个商品有名称、价格和数量等属性。现在要实现以下功能，并创建测试类，测试ShoppinaList类中所有方法
 * ①创建商品类包含以下属性:name、price、quantity(数量)提供有参/无参构造，toString方法和get/set方法
 * ②创建ShoppingList类，包含以下方法
 * ③添加商品到清单中
 * 4统计清单中所有商品的数量和总价
 * 5)根据商品名称查找并打印商品的信息
 * ⑥打印清单中所有商品的信息，按照价格从高到低排序
 * 提示:由于还没有学习List集合，需要使用Collection的toArray方法把ArrayList转化成数组，
 * (Productll todoltem = new Product[products.si
 * ze0];
 * Productl array = products.toArray(todoltem);)然后再使用Arrays进行排序
 */
public class Test
    {
        public static void main(String[] args)
            {
                Collection<Goods> goods = new ArrayList<>();
                ShoppingList sl=new ShoppingList(goods);
                sl.addGoods(new Goods("苹果", 10, 10));
                sl.addGoods(new Goods("香蕉", 20, 16));
                sl.addGoods(new Goods("榴莲", 100, 2));
                sl.addGoods(new Goods("桃子", 28, 30));
                sl.addGoods(new Goods("西瓜", 50, 6));
                System.out.println("===================================");
                //统计总价和总数量
                sl.sum();
                System.out.println("===================================");
                //根据商品名查找并打印商品信息
                sl.selectByName("西瓜");
                sl.selectByName("西瓜asd");
                System.out.println("===================================");
                //根据商品价格从高到低打印所有商品信息
                System.out.println("全部商品信息如下：");
                sl.print();
            }
    }
