package com.Encounter.d4_map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Encounter
 * @date 2024/6/28 13:52
 */

/**
 * Map集合常用方法<br/>
 * 1.添加元素: 无序，不重复，无索引。<br/>
 * 2.public int size():获取集合的大小<br/>
 * 3.public void clear():清空集合<br/>
 * 4.public boolean isEmpty(): 判断集合是否为空，为空返回true ,反之！<br/>
 * 5.public V get(Object key)：根据键获取对应值<br/>
 * 6. public V remove(Object key)：根据键删除整个元素(删除键会返回键的值)<br/>
 * 7.public  boolean containsKey(Object key): 判断是否包含某个键 ，包含返回true ,反之<br/>
 * 8.public boolean containsValue(Object value): 判断是否包含某个值。<br/>
 * 9.public Set<K> keySet(): 获取Map集合的全部键。<br/>
 * 10.public Collection<V> values(); 获取Map集合的全部值。<br/>
 * 11.把其他Map集合的数据倒入到自己集合中来。(拓展)
 */
public class MapTest2
    {
        public static void main(String[] args)
            {
                // 1.添加元素: 无序，不重复，无索引。
                Map<String, Integer> map = new HashMap<>();
                map.put("手表", 100);
                map.put("手表", 220);
                map.put("手机", 2);
                map.put("Java", 2);
                map.put(null, null);
                System.out.println(map);
                // map = {null=null, 手表=220, Java=2, 手机=2}

                // 2.public int size():获取集合的大小
                System.out.println(map.size());

                // 3、public void clear():清空集合
                //map.clear();
                //System.out.println(map);

                // 4.public boolean isEmpty(): 判断集合是否为空，为空返回true ,反之！
                System.out.println(map.isEmpty());

                // 5.public V get(Object key)：根据键获取对应值
                System.out.println(map.get("Java"));
                System.out.println(map.get("你好"));//null

                // 6. public V remove(Object key)：根据键删除整个元素(删除键会返回键的值)
                Integer remove = map.remove("手表");
                System.out.println(remove);
                System.out.println(map);

                // 7.public  boolean containsKey(Object key): 判断是否包含某个键 ，包含返回true ,反之
                System.out.println(map.containsKey("Java"));
                System.out.println(map.containsKey("java"));//false
                System.out.println(map.containsKey("手表"));

                // 8.public boolean containsValue(Object value): 判断是否包含某个值。
                System.out.println(map.containsValue(2));
                System.out.println(map.containsValue(3000));

                // 9.public Set<K> keySet(): 获取Map集合的全部键。
                System.out.println(map.keySet());

                // 10.public Collection<V> values(); 获取Map集合的全部值。
                System.out.println(map.values());

                // 11.把其他Map集合的数据倒入到自己集合中来。(拓展)
                Map<String, Integer> map1 = new HashMap<>();
                map1.put("java", 1);
                map1.put("C", 1);
                Map<String, Integer> map2 = new HashMap<>();
                map2.put("java1", 10);
                map2.put("C", 1000);
                map1.putAll(map2);
                System.out.println(map1);
                System.out.println(map2);


            }
    }
