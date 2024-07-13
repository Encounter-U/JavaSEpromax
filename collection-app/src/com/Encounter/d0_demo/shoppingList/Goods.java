package com.Encounter.d0_demo.shoppingList;

/**
 * @author Encounter
 * @date 2024/6/24 16:50
 */
public class Goods
    {
        private String name;
        private double price;
        private int quantity;

        public Goods(String name, double price, int quantity)
            {
                this.name = name;
                this.price = price;

                this.quantity = quantity;
            }

        public Goods()
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

        public double getPrice()
            {
                return price;
            }

        public void setPrice(double price)
            {
                this.price = price;
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
                return "Goods{" +
                        "name='" + name + '\'' +
                        ", price=" + price +
                        ", quantity=" + quantity +
                        '}';
            }
    }
