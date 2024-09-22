package com.Encounter.d0_demo.stageTest2;

/**
 * @author Encounter
 * @date 2024/07/20 19:52<br/>
 */
public class Product
    {
        private String name;//商品名
        private double price;//价格
        private int quantity;//库存数量
        
        public Product()
            {
            }
        
        public Product(String name, double price, int quantity)
            {
                this.name = name;
                this.price = price;
                this.quantity = quantity;
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
        
        /**
         * 输出产品信息
         * @return 产品详情
         */
        @Override
        public String toString()
            {
                return "Product{" +
                        "name='" + name + '\'' +
                        ", price=" + price +
                        ", quantity=" + quantity +
                        '}';
            }
        
        /**
         * 增加库存
         * @param quantity
         */
        public void addQuantity(int quantity)
            {
                this.quantity += quantity;
            }
        
        /**
         * 减少库存
         * @param quantity
         */
        public void reduceQuantity(int quantity)
            {
                this.quantity -= quantity;
            }
    }
