package com.Encounter.d0_demo.afterClassExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/28 20:35
 */

/**
 * 3.请使用Map集合存储白定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map
 * 集合。
 */
public class Test3
    {
        public static void main(String[] args)
            {
                Map<Car, Integer> map = new HashMap<>();
                map.put(new Car("小米su7"), 999);
                map.put(new Car("奔驰"), 999999);
                map.put(new Car("玛莎拉蒂"), 99999);
                map.put(new Car("迈巴赫"), 9999);
                map.put(new Car("奥迪"), 99);

                Set<Car> cars = map.keySet();
                for (Car car : cars)
                    {
                        System.out.println(car + "=" + map.get(car));
                    }

                Set<Map.Entry<Car, Integer>> entries = map.entrySet();
                for (Map.Entry<Car, Integer> entry : entries)
                    {
                        System.out.println(entry.getKey() + "=" + entry.getValue());
                    }
            }
    }
