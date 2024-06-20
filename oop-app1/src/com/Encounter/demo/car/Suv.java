package com.Encounter.demo.car;

/**
 * @author Encounter
 * @date 2024/6/17 22:20
 */
public class Suv extends Auto
    {
        private static double middle;
        private static double small;

        public Suv()
            {
            }

        public Suv(String brand, double length, double price)
            {
                super(brand, length, price);
            }

        public static double getMiddle()
            {
                return middle;
            }

        public static void setMiddle(double middle)
            {
                Suv.middle = middle;
            }

        public static double getSmall()
            {
                return small;
            }

        public static void setSmall(double small)
            {
                Suv.small = small;
            }

        public void judge()
            {
                if (getLength() < small)
                    {
                        System.out.println("==============");
                        show();
                        System.out.println("该车为小型车");
                        return;
                    }
                if (getLength() > middle)
                    {
                        System.out.println("==============");
                        show();
                        System.out.println("大型车");
                        return;
                    }
                System.out.println("==============");
                show();
                System.out.println("中型车");
            }

        //展示车信息
        private void show()
            {
                System.out.println("品牌：" + getBrand());
                System.out.println("价格：" + getPrice());
                System.out.println("车长：" + getLength());
            }
    }
