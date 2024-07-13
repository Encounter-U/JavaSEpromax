package com.Encounter.d0_demo.test5_2.inventory;

/**
 * @author Encounter
 * @date 2024/6/25 15:20
 */
public class Product
    {
        private String name;//商品名
        private int quantity;//数量
        private double price;//单价

        public Product(String name, int quantity, double price)
            {
                this.name = name;
                this.quantity = quantity;
                this.price = price;
            }

        public Product()
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

        public double getPrice()
            {
                return price;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }

        //获取商品总价
        public double totalPrice()
            {
                return price * quantity;
            }

        @Override
        public String toString()
            {
                return "Product{" +
                        "name='" + name + '\'' +
                        ", quantity=" + quantity +
                        ", price=" + price +
                        ",totalPrice=" + totalPrice() +
                        '}';
            }
    }
