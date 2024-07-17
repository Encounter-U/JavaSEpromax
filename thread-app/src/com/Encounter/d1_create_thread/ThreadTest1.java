package com.Encounter.d1_create_thread;

/**
 * @author Encounter
 * @date 2024/7/16 上午10:51<p/>
 * 目标：掌握线程的创建方式之一：继承Thread类
 * 1.子类继承Thread类
 * 2.重写Thread类的run方法
 * 3.创建线程类的对象代表一个线程
 * 4.启动线程（自动执行run方法）
 */
public class ThreadTest1
    {
        //main方法是由一条默认的主线程负责执行
        public static void main(String[] args)
            {
                //3.创建线程类的对象代表一个线程
                Thread t=new MyThread();
                //4.启动线程（自动执行run方法）
                t.start();//main线程 t线程
                
                for (int i = 1; i < 5; i++)
                    {
                        System.out.println("main主线程输出： " + i);
                    }
            }
    }
