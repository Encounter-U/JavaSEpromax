package com.Encounter.d9_extends_attention;

/**
 * @author Encounter
 * @date 2024/6/20 17:32
 */

import java.util.ArrayList;

/**
 * 理解泛型的注意事项
 * 1.泛型是工作在编译阶段的，一旦程序编译成class文件，class文件中就不存在泛型了，这就是泛型擦除
 * 2.泛型不支持基本数据类型，只能支持对象类型（引用数据类型）
 */
public class Test
    {
        public static void main(String[] args)
            {
                ArrayList<String> list=new ArrayList<>();
                list.add("路明非");
                list.add("路明非");
                list.add("路明非");
                System.out.println(list.get(2));

                //int型
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(5);

                ArrayList<Double> doubles=new ArrayList<>();
                doubles.add(1.0);
            }
    }
