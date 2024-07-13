package com.Encounter.d0_demo.unit2.inventory;

/**
 * @author Encounter
 * @date 2024/6/29 16:26
 */
public class Inventory
    {
        private String name;
        private int quantity;

        public Inventory(String name, int quantity)
            {
                this.name = name;
                this.quantity = quantity;
            }

        public Inventory()
            {
            }

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

        @Override
        public String toString()
            {
                return "Inventory{" +
                        "name='" + name + '\'' +
                        ", quantity=" + quantity +
                        '}';
            }
    }
