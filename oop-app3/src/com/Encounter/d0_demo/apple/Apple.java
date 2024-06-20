package com.Encounter.d0_demo.apple;

/**
 * @author Encounter
 * @date 2024/6/19 19:56
 */
public class Apple
    {
        private int size;
        private String color;

        public Apple(int size, String color)
            {
                this.size = size;
                this.color = color;
            }

        public Apple()
            {
            }

        public int getSize()
            {
                return size;
            }

        public void setSize(int size)
            {
                this.size = size;
            }

        public String getColor()
            {
                return color;
            }

        public void setColor(String color)
            {
                this.color = color;
            }
    }
