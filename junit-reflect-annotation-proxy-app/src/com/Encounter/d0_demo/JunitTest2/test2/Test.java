package com.Encounter.d0_demo.JunitTest2.test2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Encounter
 * @date 2024/07/20 14:11<br/>
 * 在开发过程中，使用线程池可以控制线程的并发数量，降低服务器压力。请按照如下要求模拟该过程:<br/>
 * ①在测试类中定义一个线程池，设置最大线程数为3，任务容器的容量为1,空闲线程的最大存在时间为20s，拒绝策略为AbortPolicy<br/>
 * ②提交5个任务，在控制台打印执行任务的线程名字
 */
public class Test
    {
        public static void main(String[] args)
            {
                try
                    {
                        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 3, 20, TimeUnit.SECONDS,
                                new ArrayBlockingQueue<>(1), Executors.defaultThreadFactory(),
                                new ThreadPoolExecutor.AbortPolicy());
                        for (int i = 0; i < 5; i++)
                            {
                                pool.execute(() -> System.out.println(Thread.currentThread().getName()));
                            }
                    }
                catch (Exception e)
                    {
                        System.out.println("等待队列已满，暂无空闲线程");;
                    }
            }
    }
