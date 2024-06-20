package com.Encounter.demo.food;

/**
 * @author Encounter
 * @date 2024/6/17 20:26
 */
public class Food
    {
        private static String region;//产地都是“新西兰”
        private String position;
        private int price;

        public Food(String position, int price)
            {
                this.position = position;
                this.price = price;
            }

        public Food()
            {
            }

        public static String getRegion()
            {
                return region;
            }

        public static void setRegion(String region)
            {
                Food.region = region;
            }

        public String getPosition()
            {
                return position;
            }

        public void setPosition(String position)
            {
                this.position = position;
            }

        public int getPrice()
            {
                return price;
            }

        public void setPrice(int price)
            {
                this.price = price;
            }
    }
