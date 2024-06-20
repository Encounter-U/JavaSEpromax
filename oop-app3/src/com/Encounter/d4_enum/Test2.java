package com.Encounter.d4_enum;

/**
 * @author Encounter
 * @date 2024/6/19 18:48
 */

/**
 * 掌握枚举类的使用场景
 */
public class Test2
    {
        public static void main(String[] args)
            {
                provideInfo(Constant.GIRL);
            }

        public static void provideInfo(Constant sex)
            {
                switch (sex)
                    {
                        case BOY -> System.out.println("男");
                        case GIRL -> System.out.println("女");
                    }
            }
    }
