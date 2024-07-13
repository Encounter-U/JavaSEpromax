package com.Encounter.d0_demo.test5_4.shopping;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/**
 * @author Encounter
 * @date 2024/6/26 16:15
 */
public class Operator
    {
        private Set<Goods> goodsSet = new HashSet<>();

        //添加商品
        public void addGoods(Goods...goods)
            {
                boolean flag = Collections.addAll(goodsSet, goods);
                if (flag)
                    {
                        StringJoiner str=new StringJoiner(",");
                        for (Goods good : goods)
                            {
                                str.add(good.getName());
                            }
                        System.out.println(str + "添加成功");
                    }
                else
                    System.out.println("添加失败");
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
