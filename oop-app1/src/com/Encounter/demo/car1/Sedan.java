package com.Encounter.demo.car1;

/**
 * @author Encounter
 * @date 2024/6/17 22:48
 */
public class Sedan extends Car
    {
        private String name;

        public Sedan()
            {
            }

        public Sedan(String models, String licensePlate, String name)
            {
                super(models, licensePlate);
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        //启动
        public void start()
            {
                System.out.println("您现在驾驶的是"+name+"的车牌号为"+getLicensePlate()+"的"+getModels()+"请系好安全带");
            }

        //停止
        public void stop()
            {
                System.out.println(name+"的车牌号为"+getLicensePlate()+"的"+getModels()+"行驶完毕");
            }
    }
