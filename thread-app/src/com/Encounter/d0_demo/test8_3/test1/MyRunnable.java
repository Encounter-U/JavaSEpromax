package com.Encounter.d0_demo.test8_3.test1;

/**
 * @author Encounter
 * @date 2024/07/17 15:49<br/>
 */
public class MyRunnable implements Runnable
    {
        @Override
        public void run()
            {
                try
                    {
                        String name = Thread.currentThread().getName();
                        System.out.println(name + "睡眠前");
                        Thread.sleep(2000);
                        System.out.println(name + "睡眠2s后");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
