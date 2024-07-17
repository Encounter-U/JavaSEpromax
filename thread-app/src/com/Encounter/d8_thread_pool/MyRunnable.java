package com.Encounter.d8_thread_pool;

/**
 * @author Encounter
 * @date 2024/07/17 14:43<br/>
 */
public class MyRunnable implements Runnable
    {
        @Override
        public void run()
            {
                System.out.println(Thread.currentThread().getName()+"--> 输出666~~~");
                try
                    {
                        Thread.sleep(Integer.MAX_VALUE);
                    }
                catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
