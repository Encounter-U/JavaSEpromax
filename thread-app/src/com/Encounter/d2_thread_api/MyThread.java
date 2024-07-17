package com.Encounter.d2_thread_api;

/**
 * @author Encounter
 * @date 2024/07/16 16:46<br/>
 */
public class MyThread extends Thread
    {
        public MyThread(String name)
            {
                super(name);
            }
        
        @Override
        public void run()
            {
                for (int i = 0; i < 5; i++)
                    System.out.println(Thread.currentThread().getName() + "子线程输出" + i);
            }
    }
