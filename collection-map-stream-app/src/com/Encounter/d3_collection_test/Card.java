package com.Encounter.d3_collection_test;

/**
 * @author Encounter
 * @date 2024/6/26 19:01
 */
public class Card
    {
        private String number;
        private String color;
        //每张牌存在大小
        private int size;//0,1,2...

        public Card(String number, String color, int size)
            {
                this.number = number;
                this.color = color;
                this.size = size;
            }

        public Card()
            {
            }

        public String getNumber()
            {
                return number;
            }

        public void setNumber(String number)
            {
                this.number = number;
            }

        public String getColor()
            {
                return color;
            }

        public void setColor(String color)
            {
                this.color = color;
            }

        public int getSize()
            {
                return size;
            }

        public void setSize(int size)
            {
                this.size = size;
            }

        @Override
        public String toString()
            {
                return color + number;
            }
    }
