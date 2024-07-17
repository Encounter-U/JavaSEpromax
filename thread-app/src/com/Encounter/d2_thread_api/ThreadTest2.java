package com.Encounter.d2_thread_api;

/**
 * @author Encounter
 * @date 2024/07/16 18:31<br/>
 * 目标：掌握sleep方法，join方法的作用
 */
public class ThreadTest2
    {
        public static void main(String[] args) throws InterruptedException
            {
                for (int i = 0; i < 5; i++)
                    {
                        System.out.println(i);
                        //休眠5s
                        if (i==3)
                            //让当前执行的线程暂停5s，再继续执行
                            Thread.sleep(5000);
                    }
                
                //join方法作用：让当前调用该方法的线程先执行完
                MyThread t1 = new MyThread("1号线程");
                t1.start();
                t1.join();
                
                MyThread t2 = new MyThread("2号线程");
                t2.start();
                t2.join();
                
                MyThread t3 = new MyThread("3号线程");
                t3.start();
                t3.join();
                
            }
    }
