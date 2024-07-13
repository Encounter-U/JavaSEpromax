package com.Encounter.d0_demo.test5_5.shoppingOS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/28 21:06
 */
public class GoodsOperator
    {
        private Map<String, Goods> goodsMap = new HashMap<>();

        //添加商品
        public void addGoods(String name, Goods goods)
            {
                goodsMap.put(name, goods);
            }

        //展示商品
        public void show()
            {
                goodsMap.forEach((k, v) -> System.out.println(k + ":" + v));
            }

        //计算总计
        public void sumPrice()
            {
                double sumPrice = 0;
                Set<Map.Entry<String, Goods>> entries = goodsMap.entrySet();
                for (Map.Entry<String, Goods> entry : entries)
                    {
                        sumPrice += (entry.getValue().getPrice() * entry.getValue().getQuantity());
                    }
                System.out.println("总价为：" + sumPrice);
            }

    }
