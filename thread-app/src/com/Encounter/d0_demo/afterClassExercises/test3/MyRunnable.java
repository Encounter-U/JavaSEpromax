package com.Encounter.d0_demo.afterClassExercises.test3;

/**
 * @author Encounter
 * @date 2024/07/16 22:45<br/>
 */
public class MyRunnable implements Runnable
    {
        private String name;
        
        public MyRunnable(String name)
            {
                this.name = name;
            }
        
        @Override
        public void run()
            {
                
                try
                    {
                        for (int i = 0; i < 10; i++)
                            {
                                Thread.currentThread().setName(name);
                                System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
                                Thread.sleep(3000);
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
                
            }
    }
