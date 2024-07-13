package com.Encounter.d8_genrics_method;

/**
 * @author Encounter
 * @date 2024/6/20 17:15
 */

import java.util.ArrayList;

/**
 * 掌握泛型方法的定义和使用
 */
public class Test
    {
        public static void main(String[] args)
            {
                System.out.println(test("路明非"));

                Dog test = test(new Dog());

                //需求，所有的汽车可以参加比赛
                ArrayList<Car> cars = new ArrayList<>();
                cars.add(new BENZ());
                cars.add(new BMW());
                go(cars);

                ArrayList<BMW> bmws=new ArrayList<>();
                cars.add(new BMW());
                cars.add(new BMW());
                go(bmws);

                ArrayList<BENZ> benzs=new ArrayList<>();
                cars.add(new BENZ());
                cars.add(new BENZ());
                go(benzs);
            }

        public static <T> T test(T t)
            {
                return t;
            }

        /*public static void go(ArrayList<Car> cars)
            {

            }*/
        /*public static<T extends Car> void go(ArrayList<T> ts)
            {

            }*/
        //? 通配符：在使用泛型时可以代表一切类型    ? extends Car(上限)    ? super Car(下限)
        public static void go(ArrayList<? extends Car> cars)
            {

            }
    }


