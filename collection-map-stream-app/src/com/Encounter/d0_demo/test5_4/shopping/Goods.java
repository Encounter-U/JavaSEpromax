package com.Encounter.d0_demo.test5_4.shopping;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/26 16:13
 */
public class Goods
    {
        private String name;
        private double price;

        public Goods(String name, double price)
            {
                this.name = name;
                this.price = price;
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

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Goods goods = (Goods) o;
                return Double.compare(price, goods.price) == 0 && Objects.equals(name, goods.name);
            }

        @Override
        public int hashCode()
            {
                return Objects.hash(name, price);
            }
    }
