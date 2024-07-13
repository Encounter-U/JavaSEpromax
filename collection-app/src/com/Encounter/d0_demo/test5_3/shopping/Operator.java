package com.Encounter.d0_demo.test5_3.shopping;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/26 16:15
 */
public class Operator
    {
        private Set<Goods> goodsSet = new HashSet<>();

        //添加商品
        public void addGoods(Goods goods)
            {
                if (!goodsSet.contains(goods))
                    {
                        goodsSet.add(goods);
                        System.out.println(goods.getName() + "添加成功");
                    }
                else
                    System.out.println(goods.getName() + "已存在");
            }

        //移除
        public void deleteByName(String name)
            {
                for (Goods goods : goodsSet)
                    {
                        if (name.equals(goods.getName()))
                            {
                                goodsSet.remove(goods);
                                System.out.println(goods.getName() + "已删除");
                                return;
                            }
                    }
                System.out.println("该商品不存在");
            }

        //展示购物车
        public void show()
            {
                for (Goods goods : goodsSet)
                    {
                        System.out.println("商品名：" + goods.getName());
                        System.out.println("价格：" + goods.getPrice());
                    }
            }
    }
