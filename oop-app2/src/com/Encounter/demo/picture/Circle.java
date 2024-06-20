package com.Encounter.demo.picture;

/**
 * @author Encounter
 * @date 2024/6/18 20:34
 */
public class Circle extends Picture
    {
        private int centerX;//圆心x坐标
        private int centerY;//圆心y坐标
        private int radius;//圆半径

        public Circle(int sideLength, int sideCount, int centerX, int centerY, int radius)
            {
                super(sideLength, sideCount);
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
            }

        public Circle()
            {
            }

        public int getCenterX()
            {
                return centerX;
            }

        public void setCenterX(int centerX)
            {
                this.centerX = centerX;
            }

        public int getCenterY()
            {
                return centerY;
            }

        public void setCenterY(int centerY)
            {
                this.centerY = centerY;
            }

        public int getRadius()
            {
                return radius;
            }

        public void setRadius(int radius)
            {
                this.radius = radius;
            }

        //周长
        @Override
        public void getPerimeter()
            {
                System.out.println("圆的周长为：" + 2 * 3.14 * radius);
            }

        //面积
        @Override
        public void getArea()
            {
                System.out.println("圆的面积为：" + 3.14 * radius * radius);
            }

        //显示详情
        @Override
        public void showInfo()
            {
                System.out.println("圆心的x坐标为：" + centerX);
                System.out.println("圆心的y坐标为：" + centerY);
                System.out.println("圆半径为：" + radius);
            }
    }
