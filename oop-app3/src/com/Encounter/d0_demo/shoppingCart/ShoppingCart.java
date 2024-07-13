package com.Encounter.d0_demo.shoppingCart;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/20 21:11
 */
public class ShoppingCart
    {
        private ArrayList<Product> products = new ArrayList<>();

        public ShoppingCart(ArrayList<Product> products)
            {
                this.products = products;
            }

        public ShoppingCart()
            {
            }

        public ArrayList<Product> getProducts()
            {
                return products;
            }

        public void setProducts(ArrayList<Product> products)
            {
                this.products = products;
            }

        //添加到购物车
        void addProduct(Product product)
            {
                products.add(product);
            }

        //移除出购物车
        void removeProduct(Product product)
            {
                products.remove(product);
            }

        //计算总价
        double calculateTotalPrice()
            {
                double totalPrice=0;
                for (int i = 0; i < products.size(); i++)
                    {
                        totalPrice+=products.get(i).price;
                    }
                return totalPrice;
            }
    }
