package com.Encounter.d0_demo.afterClassExercises.test2;

/**
 * @author Encounter
 * @date 2024/07/16 22:42<br/>
 * 创建一个测试类，观察线程的start()和run()方法的区别<br/>
 * ①创建一个类，继承Thread类，并重写里面的run()方法，实现在睡眠5s后控制台输出0-9<br/>
 * ②在测试类中，创建两个线程，分别调用run0方法，和启动两条线程
 */
public class Test
    {
        public static void main(String[] args)
            {
                Thread t1 = new MyThread();
                t1.start();
                
                Thread t2 = new MyThread();
                t2.run();
            }
    }
