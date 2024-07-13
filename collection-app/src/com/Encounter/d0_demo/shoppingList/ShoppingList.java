package com.Encounter.d0_demo.shoppingList;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * @author Encounter
 * @date 2024/6/24 16:52
 */
public class ShoppingList
    {
        private Collection<Goods> goods;

        public ShoppingList(Collection<Goods> goods)
            {
                this.goods = goods;
            }

        //添加商品
        public void addGoods(Goods goods)
            {
                this.goods.add(goods);
                System.out.println(goods.getName() + "添加成功");
            }

        //统计数量和总价
        public void sum()
            {
                int sumQuantity = 0;
                double sumPrice = 0;
                Iterator<Goods> g1=goods.iterator();
                for (Goods g2 :goods)
                    {
                        g2 = g1.next();
                        sumQuantity += g2.getQuantity();
                        sumPrice += g2.getPrice();
                    }
                System.out.println("总数量为：" + sumQuantity);
                System.out.println("总价为：" + sumPrice);
            }

        //根据名称查找并打印商品信息
        public void selectByName(String name)
            {
                for (Goods g1 : goods)
                    {
                        if (g1.getName().equals(name))
                            {
                                System.out.println(g1);
                                return;
                            }
                    }
                System.out.println("暂时没有要查找的商品");
            }

        //打印商品信息并按照由高到低排序
        public void print()
            {
                Goods[] goodsArray = goods.toArray(new Goods[goods.size()]);
                Arrays.sort(goodsArray, (o1, o2) -> (int) (o2.getPrice()-o1.getPrice()));
                for (Goods goods1 : goodsArray)
                    System.out.println(goods1);
            }
    }
