package com.Encounter.d7_method_references;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Encounter
 * @date 2024/6/22 12:06
 */
public class Test2
    {
        public static void main(String[] args)
            {
                String[] name={"Bode","angle","Andy","coco","jack"};

                //进行排序（默认按字符串首字符编号进行升序排序）
                Arrays.sort(name);

                //忽略大小写排序
                /*Arrays.sort(name, new Comparator<String>()
                    {
                        @Override
                        public int compare(String o1, String o2)
                            {
                                return o1.compareToIgnoreCase(o2);
                            }
                    });*/
                //特定类型方法引用
                Arrays.sort(name, String::compareToIgnoreCase);

                System.out.println(Arrays.toString(name));
            }
    }
