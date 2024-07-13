package com.Encounter.d0_demo.ZhangJiePingCe2.supermarketOS;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Encounter
 * @date 2024/6/23 14:18
 */

/**
 * 给一家超市管理系统编写一个程序
 * 1.要求能够统计每种商品销售量的前N名，并输出其销售数量及商品名称
 * 2.商品信息存储在一个数组中，每个元素包含商品名称和销售数量两个属性。
 * 3.编写一个方法，能够接收一个商品信息数组和一个整数N，返回销售量前N名的商品信息。
 * 提示:可以使用Arrays类的sort方法进行排序，使用Comparator接口自定义排序规则，然后使用Arrays类的copyOf方法进行结果拷贝
 */
public class Test
    {
        public static void main(String[] args)
            {
                Goods[] goods = {new Goods("苹果", 100),
                        new Goods("香蕉", 180),
                        new Goods("火龙果", 30),
                        new Goods("西瓜", 23),
                        new Goods("桃子", 200)};
                //按照销售量由高到低排序
                Arrays.sort(goods, (o1, o2) -> Integer.compare(o2.getSales(),o1.getSales()));
                //拷贝数组
                Goods[] newGoods = Arrays.copyOf(goods, goods.length);
                //打印销售量前三的商品
                print(newGoods,3);
            }

        public static void print(Goods[] goods,int num)
            {
                for (int i = 0; i < num; i++)
                    {
                        System.out.println(goods[i]);
                    }
            }
    }
