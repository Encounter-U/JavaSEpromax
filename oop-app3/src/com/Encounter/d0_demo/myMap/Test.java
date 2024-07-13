package com.Encounter.d0_demo.myMap;

/**
 * @author Encounter
 * @date 2024/6/20 17:52
 */

/**
 * 请定义一个泛型类 MyMap<K,V>，包含两个成员变量 first和 second，first的类型是K,second的类型是V
 * ① 定义有参构造方法和first、second的get/set方法。
 * ② 新建一个测试类，在main方法中创建MyMap对象传入值，打印first和second
 * ③ 在Myap类中定义一个无返回值的泛型方法print，接收一个泛型参数，并将接收到的泛型参数打印到控制台上
 */
public class Test
    {
        public static void main(String[] args)
            {
                MyMap myMap = new MyMap<>();
                myMap.setFirst("路明非");
                myMap.setSecond(22);
                System.out.println(myMap.getFirst());
                System.out.println(myMap.getSecond());
                print("你好");
            }
        public static <T> void print(T t)
            {
                System.out.println(t);
            }
    }
