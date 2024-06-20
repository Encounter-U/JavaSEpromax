package com.Encounter.demo.picture;

/**
 * @author Encounter
 * @date 2024/6/18 20:41
 */
public class Rect extends Picture
    {
        private int length;
        private int width;

        public Rect(int sideLength, int sideCount, int length, int width)
            {
                super(sideLength, sideCount);
                this.length = length;
                this.width = width;
            }

        public Rect()
            {
            }

        public int getLength()
            {
                return length;
            }

        public void setLength(int length)
            {
                this.length = length;
            }

        public int getWidth()
            {
                return width;
            }

        public void setWidth(int width)
            {
                this.width = width;
            }

        //周长
        @Override
        public void getPerimeter()
            {
                System.out.println("矩形的周长为：" + (width + length) * 2);
            }

        //面积
        @Override
        public void getArea()
            {
                System.out.println("矩形的面积为：" + width * length);
            }

        //显示详情
        @Override
        public void showInfo()
            {
                System.out.println("矩形的长为：" + length);
                System.out.println("矩形的宽为：" + width);
            }
    }
