package com.Encounter.demo.afterClassExercises.Test2;

/**
 * @author Encounter
 * @date 2024/6/19 15:44
 */
public class Mouse implements USB
    {
        @Override
        public void start()
            {
                System.out.println("连接鼠标的USB");
            }

        @Override
        public void stop()
            {
                System.out.println("断开鼠标的USB");
            }
    }
