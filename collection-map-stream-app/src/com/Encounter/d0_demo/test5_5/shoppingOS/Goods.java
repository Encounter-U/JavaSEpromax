package com.Encounter.d0_demo.test5_5.shoppingOS;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/28 21:02
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

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Goods goods = (Goods) o;
                return Double.compare(price, goods.price) == 0 && quantity == goods.quantity && Objects.equals(name, goods.name);
            }

        @Override
        public int hashCode()
            {
                return Objects.hash(name, price, quantity);
            }
    }
