package com.Encounter.d0_demo.apple;

/**
 * @author Encounter
 * @date 2024/6/19 19:59
 */
public class Worker
    {
        public Apple pickApple(CompareAble compareAble,Apple a1,Apple a2)
            {
                Apple apple = compareAble.compare(a1, a2);
                System.out.println("较好的苹果是"+apple.getColor()+"的");
                return apple;
            }
    }
