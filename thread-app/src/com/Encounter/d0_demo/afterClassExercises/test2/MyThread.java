package com.Encounter.d0_demo.afterClassExercises.test2;

/**
 * @author Encounter
 * @date 2024/07/16 22:41<br/>
 */
public class MyThread extends Thread
    {
        @Override
        public void run()
            {
                try
                    {
                        Thread.sleep(5000);
                        for (int i = 0; i < 10; i++)
                            {
                                System.out.println(i);
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
