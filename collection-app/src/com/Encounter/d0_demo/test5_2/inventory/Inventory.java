package com.Encounter.d0_demo.test5_2.inventory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Encounter
 * @date 2024/6/25 15:22
 */
public class Inventory
    {
        private List<Product> products = new ArrayList<>();

        //添加商品
        public void addProduct(Product product)
            {
                products.add(product);
            }

        //查找商品
        public void selectByName(String name)
            {
                System.out.println("====================");
                for (Product product : products)
                    {
                        if (product.getName().equals(name))
                            {
                                System.out.println("您要查询的信息如下：");
                                System.out.println(product);
                                System.out.println("====================");
                                return;
                            }
                    }
                System.out.println("暂无该商品");
                System.out.println("====================");
            }

        //统计所有商品数量和总价
        public void sum()
            {
                int sumQuantity = 0;
                double sumPrice = 0;
                for (Product product : products)
                    {
                        sumQuantity += product.getQuantity();
                        sumPrice += product.totalPrice();
                    }
                System.out.println("总数量为：" + sumQuantity);
                System.out.println("总价为：" + sumPrice);
            }


        //打印所有商品信息
        public void showAll()
            {
                System.out.println("====================");
                for (Product product : products)
                    {
                        System.out.println("商品名：" + product.getName());
                        System.out.println("数量：" + product.getQuantity());
                        System.out.println("单价：" + product.getPrice());
                        System.out.println("总价为：" + product.totalPrice());
                        System.out.println("===================");
                    }
            }
    }
