package com.Encounter.d0_demo.test10_1.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Encounter
 * @date 2024/07/19 15:26<br/>
 * 开发了一个购物车类ShoppingCart ，现在需要编写一个测试方法来检查添加商品到购物车的功能是否按预期工作。
 * ①使用Jnit框架来编写测试方法，
 * ②使用@BeforeEach注释来初始化购物车对象
 * ③使用@AfterEach注释来清除购物车对象。
 * ④在测试方法中，使用assert语句来检查添加商品到购物车的数量和价格功能是否按预期工作。
 */
public class ShoppingCart
    {
        private List<Item> items;
        
        public ShoppingCart()
            {
                items = new ArrayList<Item>();
            }
        
        public void addItem(Item item)
            {
                items.add(item);
            }
        
        public void removeItem(Item item)
            {
                items.remove(item);
            }
        
        public int getItemCount()
            {
                return items.size();
            }
        
        public double getTotalPrice()
            {
                double totalPrice = 0;
                for (Item item : items)
                    {
                        totalPrice += item.getPrice();
                    }
                return totalPrice;
            }
    }
