package com.Encounter.d0_demo.stageTest2;

import org.junit.Before;

/**
 * @author Encounter
 * @date 2024/07/20 22:29<br/>
 */
public class TestInventory
    {
        private Inventory inventory;
        @Before
        public void init()
            {
                inventory = new Inventory();
            }
        //入库
        @Test
        public void testWarehousing()
            {
                inventory.warehousing(new Product("ss",2.0,3));
            }
        
        //出库
        @Test
        public void testReduceInventory()
            {
                inventory.reduceInventory(new Product("ss",2.0,2));
            }
        
        //根据名字查询
        @Test
        public void testQueryInventory()
            {
                inventory.queryInventory("cc");
            }
        
        //查询全部
        @Test
        public void testQueryAll()
            {
                inventory.queryAll();
            }
    }
