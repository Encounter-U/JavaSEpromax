package com.Encounter.demo.afterClassExercises.Test2;

/**
 * @author Encounter
 * @date 2024/6/19 15:42
 */
public class Computer
    {
        private USB USB=new Mouse();
        public void begin()
            {
                System.out.println("开机");
                USB.start();
            }
        public void end()
            {
                USB.stop();
                System.out.println("关机");
            }
    }
