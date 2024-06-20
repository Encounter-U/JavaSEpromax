package com.Encounter.demo.cylinder;

/**
 * @author Encounter
 * @date 2024/6/19 16:08
 */
public class Cylinder implements C
    {
        private double radius;
        private double height;
        private String color;

        public Cylinder(double radius, double height, String color)
            {
                this.radius = radius;
                this.height = height;
                this.color = color;
            }

        public Cylinder()
            {
            }

        public double getRadius()
            {
                return radius;
            }

        public void setRadius(double radius)
            {
                this.radius = radius;
            }

        public double getHeight()
            {
                return height;
            }

        public void setHeight(double height)
            {
                this.height = height;
            }

        public String getColor()
            {
                return color;
            }

        //设置颜色
        @Override
        public void setColor(String c)
            {
                this.color = c;
            }

        //计算侧面积
        @Override
        public double area()
            {
                return 2 * π * radius * height;
            }

        //计算体积
        @Override
        public double volume()
            {
                return π * radius * radius * height;
            }
    }
