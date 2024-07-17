package com.Encounter.d1_create_thread;

/**
 * @author Encounter
 * @date 2024/07/16 11:23<p/>
 * 1.子类继承Thread类
 * 2.重写Thread类的run方法
 * 3.创建线程类的对象代表一个线程
 * 4.启动线程（自动执行run方法）
 */
//1.子类继承Thread类
public class MyThread extends Thread
    {
        //2.重写Thread类的run方法
        @Override
        public void run()
            {
                //描述线程的执行任务
                for (int i = 1; i < 5; i++)
                    {
                        System.out.println("MyThread子线程输出： " + i);
                    }
            }
    }
