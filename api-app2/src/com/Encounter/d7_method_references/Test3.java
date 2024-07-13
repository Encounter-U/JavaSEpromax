package com.Encounter.d7_method_references;

interface CreateCar
    {
        Car creat(String name, double price);
    }

/**
 * @author Encounter
 * @date 2024/6/22 12:14
 */
public class Test3
    {
        public static void main(String[] args)
            {
                //1.创建这个接口的匿名内部类对象
                /*CreateCar cc = new CreateCar()
                    {
                        @Override
                        public Car creat(String name, double price)
                            {
                                return new Car(name, price);
                            }
                    };*/
                //构造器引用
                CreateCar cc = Car::new;
                cc.creat("小米su7",29.9);
            }
    }