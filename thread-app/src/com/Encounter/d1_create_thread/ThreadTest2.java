package com.Encounter.d1_create_thread;

/**
 * @author Encounter
 * @date 2024/07/16 11:56<br/>
 * 目标：掌握多线程的创建方式二：实现Runnable接口<br/>
 * 1.定义一个任务类，实现Runnable接口<br/>
 * 2.重写Runnable的run方法<br/>
 * 3.创建任务对象，任务对象没有start方法<br/>
 * 4.把任务对象交给一个线程对象处理
 */
public class ThreadTest2
    {
        public static void main(String[] args)
            {
                //3.创建任务对象，任务对象没有start方法
                Runnable target=new MyRunnable();
                //4.把任务对象交给一个线程对象处理
                new Thread(target).start();
                
                for (int i = 0; i < 5; i++)
                    {
                        System.out.println("主线程main "+i+" is running.");
                    }
            }
    }
