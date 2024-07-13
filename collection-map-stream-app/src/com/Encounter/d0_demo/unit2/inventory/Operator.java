package com.Encounter.d0_demo.unit2.inventory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Encounter
 * @date 2024/6/29 16:33
 */
public class Operator
    {
        private Map<String, Inventory> inventoryMap = new HashMap<>();

        //更新库存
        public void updateInventory(String name, int quantity)
            {
                Inventory inventory = existByName(inventoryMap, name);
                if (inventory != null)
                    {
                        inventory.setQuantity(quantity);
                        System.out.println(name + "的信息已更新");
                    }
                else
                    {
                        inventoryMap.put(name, new Inventory(name, quantity));
                        System.out.println(name + "不存在，已添加该商品信息");
                    }
            }

        //根据商品名查找并返回库存对象
        private Inventory existByName(Map<String, Inventory> inventoryMap, String name)
            {
                boolean containsKey = inventoryMap.containsKey(name);
                if (containsKey)
                    return inventoryMap.get(name);
                return null;
            }

        //检查库存
        public void ampleOrNot(String name, int purchasedNum)
            {
                if (existByName(inventoryMap, name) == null)
                    {
                        System.out.println("您要检查的商品不存在");
                        return;
                    }
                if (purchasedNum > inventoryMap.get(name).getQuantity())
                    System.out.println("库存不足");
                else
                    System.out.println("库存充足");
            }

        //添加商品到购物车
        public void addCar(String name,int quantity)
            {
                if (existByName(inventoryMap, name) == null)
                    {
                        System.out.println("您要添加的商品不存在");
                        return;
                    }
                if (quantity > inventoryMap.get(name).getQuantity())
                    System.out.println("库存不足，无法添加");
                else
                    System.out.println("库存充足，可以添加");
            }
    }
