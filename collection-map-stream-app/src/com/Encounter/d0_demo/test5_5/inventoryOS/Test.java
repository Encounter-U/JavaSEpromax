package com.Encounter.d0_demo.test5_5.inventoryOS;

/**
 * @author Encounter
 * @date 2024/6/28 21:32
 */

/**
 * 实现一个库存管理系统。实现以下功能:
 * ①封装一个库存类，包含商品的名称和库存数量等属性。
 * ②)使用HashMap作为库存管理的数据结构，将商品名称作为键，库存对象作为值存储到Map中。
 * ③提供更新库存的方法，接收商品名称和数量作为参数，根据传入的数量更新库存数量。
 * 4)提供检查库存是否充足的方法，根据商品名称获取库存对象，并判断库存数量是否大于等于购买数量.
 * ⑤在添加商品到购物车的方法中(不用实际添加到购物车，自己有兴趣可以结合第二题来做)，需要检查库存是否充足，如果库存不足，则不允许
 * 添加商品到购物车，并输出提示信息。
 */
public class Test
    {
        public static void main(String[] args)
            {
                InventoryOperator io=new InventoryOperator();
                io.updateInventory("苹果",50);
                io.updateInventory("香蕉",500);
                io.updateInventory("榴莲",5000);

                io.purchase("苹果",500);
                io.purchase("榴莲",500);

            }
    }
