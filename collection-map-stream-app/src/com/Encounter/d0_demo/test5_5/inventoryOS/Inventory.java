package com.Encounter.d0_demo.test5_5.inventoryOS;

/**
 * @author Encounter
 * @date 2024/6/28 21:16
 */
public class Inventory
    {
        private String name;
        private int quantity;

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getQuantity()
            {
                return quantity;
            }

        public void setQuantity(int quantity)
            {
                this.quantity = quantity;
            }

        public Inventory(String name, int quantity)
            {
                this.name = name;
                this.quantity = quantity;
            }

        public Inventory()
            {
            }

        @Override
        public String toString()
            {
                return "Inventory{" +
                        "name='" + name + '\'' +
                        ", quantity=" + quantity +
                        '}';
            }
    }
