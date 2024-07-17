package com.Encounter.d2_thread_api;

/**
 * @author Encounter
 * @date 2024/07/16 16:47<br/>
 * 目标：掌握Thread的常用方法
 */
public class ThreadTest1
    {
        public static void main(String[] args)
            {
                Thread t1 = new MyThread("MyThread1");
                //t1.setName("MyThread1");
                t1.start();
                System.out.println(t1.getName());//Thread-0
                
                Thread t2 = new MyThread("MyThread2");
                //t2.setName("MyThread2");
                t2.start();
                System.out.println(t2.getName());//Thread-1
                
                //主线程的名字
                //那个线程执行的就获取哪个线程对象
                Thread thread = Thread.currentThread();
                thread.setName("main");
                System.out.println(thread.getName());//main
                
                for (int i = 0; i < 5; i++)
                    {
                        System.out.println(thread.getName()+"线程输出" + i);
                    }
            }
    }
