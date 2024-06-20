package com.Encounter.demo.car1;

/**
 * @author Encounter
 * @date 2024/6/17 22:48
 */
public class Taxi extends Car
    {
        private String brand;

        public Taxi()
            {
            }

        public Taxi(String models, String licensePlate, String brand)
            {
                super(models, licensePlate);
                this.brand = brand;
            }

        public String getBrand()
            {
                return brand;
            }

        public void setBrand(String brand)
            {
                this.brand = brand;
            }

        //启动
        public void start()
            {
                System.out.println("欢迎乘坐"+brand+"的车牌号为"+getLicensePlate()+"的"+getModels()+"型出租车，请系好安全带");
            }

        //停止
        public void stop()
            {
                System.out.println("感谢乘坐"+brand+"的车牌号为"+getLicensePlate()+"的"+getModels()+"型出租车，下车时请记得带好随身物品");
            }
    }
