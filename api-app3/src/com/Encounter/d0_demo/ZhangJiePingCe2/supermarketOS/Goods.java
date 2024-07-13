package com.Encounter.d0_demo.ZhangJiePingCe2.supermarketOS;

/**
 * @author Encounter
 * @date 2024/6/23 14:17
 */
public class Goods
    {
        private int sales;//销售量
        private String name;//商品名

        public Goods(String name, int sales)
            {
                this.sales = sales;
                this.name = name;
            }

        public Goods()
            {
            }

        public int getSales()
            {
                return sales;
            }

        public void setSales(int sales)
            {
                this.sales = sales;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        @Override
        public String toString()
            {
                return "Goods{" +
                        "销售量:" + sales +
                        ", 商品名:" + name +
                        '}';
            }
    }
