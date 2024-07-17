package com.Encounter.d0_demo.afterClassExercises.test1;

import java.util.concurrent.Callable;

/**
 * @author Encounter
 * @date 2024/07/16 20:56<br/>
 */
public class MyCallable implements Callable<Long>
    {
        @Override
        public Long call() throws Exception
            {
                for (int i = 0; i < 9; i++)
                    {
                        System.out.println(System.currentTimeMillis());
                        Thread.sleep(3000);
                    }
                return System.currentTimeMillis();
            }
    }
