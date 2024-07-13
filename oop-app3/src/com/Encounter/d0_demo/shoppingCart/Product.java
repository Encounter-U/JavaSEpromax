package com.Encounter.d0_demo.shoppingCart;

/**
 * @author Encounter
 * @date 2024/6/20 21:10
 */
public class Product implements Cloneable
    {
        int id;
        String name;
        double price;

        public Product(int id, String name, double price)
            {
                this.id = id;
                this.name = name;
                this.price = price;
            }

        public Product()
            {
            }

        public int getId()
            {
                return id;
            }

        public void setId(int id)
            {
                this.id = id;
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
                Product product = (Product) o;
                return id == product.id;
            }

        @Override
        public String toString()
            {
                return "Product{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        '}';
            }

        @Override
        protected Object clone() throws CloneNotSupportedException
            {
                return super.clone();
            }
    }
