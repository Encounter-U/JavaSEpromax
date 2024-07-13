package com.Encounter.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Encounter
 * @date 2024/6/28 15:10
 */
public class MapTest3
    {
        public static void main(String[] args)
            {
                //准备一个Map集合
                Map<String, Double> map = new HashMap<>();
                map.put("路明非", 178.0);
                map.put("楚子航", 182.0);
                map.put("夏弥", 169.8);
                map.put("上杉绘梨衣", 165.7);

                /*map.forEach(new BiConsumer<String, Double>()
                    {
                        @Override
                        public void accept(String string, Double aDouble)
                            {
                                System.out.println(string + "=" + aDouble);
                            }
                    });*/
                map.forEach((string, aDouble) -> System.out.println(string + "=" + aDouble));
            }
    }
