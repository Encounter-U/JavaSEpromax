package com.Encounter.d0_demo.test10_1.test2;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Encounter
 * @date 2024/07/19 15:28<br/>
 * 开发了一个购物车类ShoppingCart ，现在需要编写一个测试方法来检查添加商品到购物车的功能是否按预期工作。
 * ①使用Jnit框架来编写测试方法，
 * ②使用@BeforeEach注释来初始化购物车对象
 * ③使用@AfterEach注释来清除购物车对象。
 * ④在测试方法中，使用assert语句来检查添加商品到购物车的数量和价格功能是否按预期工作。
 */
public class ShoppingCartTest
    {
        private static ShoppingCart shoppingCart;
        @BeforeClass
        public static void init()
            {
                shoppingCart = new ShoppingCart();
            }
        
        @AfterClass
        public static void clear()
            {
                shoppingCart = null;
            }
        
        @Test
        public void testAddItem()
            {
                shoppingCart.addItem(new Item("苹果", 30));
                shoppingCart.addItem(new Item("香蕉", 50));
                shoppingCart.addItem(new Item("榴莲", 100));
                Assert.assertEquals("添加失败，程序有BUG",3, shoppingCart.getItemCount());
            }
        
        @Test
        public void testGetTotalPrice()
            {
                double totalPrice = shoppingCart.getTotalPrice();
                Assert.assertEquals("程序有BUG",280, totalPrice,0.001);
            }
        
        @Test
        public  void testRemoveItem()
            {
                Item item1=new Item("苹果", 30);
                Item item2=new Item("香蕉", 50);
                Item item3=new Item("榴莲", 100);
                
                shoppingCart.addItem(item1);
                shoppingCart.addItem(item2);
                shoppingCart.addItem(item3);
                
                shoppingCart.removeItem(item1);
                shoppingCart.removeItem(item2);
                Assert.assertEquals("移除失败，程序有BUG",4, shoppingCart.getItemCount());
            }
    }
