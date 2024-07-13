package com.Encounter.d0_demo.test5_5.inventoryOS;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Encounter
 * @date 2024/6/28 21:19
 */
public class InventoryOperator
    {
        private Map<String,Inventory> inventoryMap=new HashMap<>();

        //更新库存
        public void updateInventory(String name,int quantity)
            {
                inventoryMap.put(name,new Inventory(name,quantity));
            }

        //判断库存
        public void purchase(String name,int quantityPurchased)
            {
                if (quantityPurchased>inventoryMap.get(name).getQuantity())
                    System.out.println("库存不足");
                else
                    System.out.println("库存充足");
            }

    }
