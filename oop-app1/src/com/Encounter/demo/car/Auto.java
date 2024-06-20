package com.Encounter.demo.car;

/**
 * @author Encounter
 * @date 2024/6/17 22:20
 */
public class Auto
    {
        private String brand;
        private double length;
        private double price;

        public Auto(String brand, double length, double price)
            {
                this.brand = brand;
                this.length = length;
                this.price = price;
            }

        public Auto()
            {
            }

        public String getBrand()
            {
                return brand;
            }

        public void setBrand(String brand)
            {
                this.brand = brand;
            }

        public double getLength()
            {
                return length;
            }

        public void setLength(double length)
            {
                this.length = length;
            }

        public double getPrice()
            {
                return price;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }
    }
