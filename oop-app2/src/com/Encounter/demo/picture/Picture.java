package com.Encounter.demo.picture;

/**
 * @author Encounter
 * @date 2024/6/18 20:28
 */
public abstract class Picture
    {
        private int sideLength;//边长
        private int sideCount;//边数

        public Picture(int sideLength, int sideCount)
            {
                this.sideLength = sideLength;
                this.sideCount = sideCount;
            }

        public Picture()
            {
            }

        public int getSideLength()
            {
                return sideLength;
            }

        public void setSideLength(int sideLength)
            {
                this.sideLength = sideLength;
            }

        public int getSideCount()
            {
                return sideCount;
            }

        public void setSideCount(int sideCount)
            {
                this.sideCount = sideCount;
            }

        //求周长
        public abstract void getPerimeter();

        //求面积
        public abstract void getArea();

        //显示图形信息
        public final void show()
            {
                System.out.println("边数："+sideCount);
                System.out.println("边长："+sideLength);
                showInfo();
            }
        public abstract void showInfo();
    }
