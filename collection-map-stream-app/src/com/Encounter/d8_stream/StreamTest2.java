package com.Encounter.d8_stream;

/**
 * @author Encounter
 * @date 2024/6/29 11:11
 */

import java.util.*;
import java.util.stream.Stream;

/**
 * 使用Stream流
 */
public class StreamTest2
    {
        public static void main(String[] args)
            {
                //1.如何获取List集合的Stream流
                List<String> names = new ArrayList<>();
                Collections.addAll(names, "路明非", "楚子航", "夏弥", "上杉绘梨衣");
                Stream<String> stream = names.stream();

                //2.如何获取Set集合的Stream流
                Set<String> set = new HashSet<>();
                Collections.addAll(set, "李白", "貂蝉", "上官婉儿", "武则天");
                set.stream().filter(s -> s.contains("李")).forEach(System.out::println);

                //3.如何获取Map集合的Stream流
                Map<String, Double> map = new HashMap<>();
                map.put("路明非", 178.0);
                map.put("楚子航", 182.1);
                map.put("夏弥", 172.3);
                map.put("上杉绘梨衣", 169.5);
                Set<String> keySet = map.keySet();
                Stream<String> ks = keySet.stream();

                Collection<Double> values = map.values();
                Stream<Double> v = values.stream();

                Set<Map.Entry<String, Double>> entries = map.entrySet();
                Stream<Map.Entry<String, Double>> kvs = entries.stream();
                kvs.filter(e -> e.getKey().contains("路")).forEach(s -> System.out.println(s.getKey() + "=" + s.getValue()));

                //4.如何获取数组的Stream流
                String[] name = {"路明非", "楚子航", "夏弥", "上杉绘梨衣"};
                Stream<String> stream1 = Arrays.stream(name);
                Stream<String> name1 = Stream.of(name);
            }
    }
