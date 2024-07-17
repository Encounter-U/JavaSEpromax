package com.Encounter.d8_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Encounter
 * @date 2024/07/17 14:34<br/>
 * 目标：掌握线程池的创建
 */
public class ThreadPoolTest3
    {
        public static void main(String[] args) throws Exception
            {
                //1.通过ThreadPoolExecutor创建一个线程池对象
                /*ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                        TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.CallerRunsPolicy());//由主线程负责调用任务的run方法从而绕过线程池直接执行*/
                
                //1.2通过Executors创建一个线程池对象
                ExecutorService pool = Executors.newFixedThreadPool(5);
                //ExecutorService pool = Executors.newSingleThreadExecutor();
                /*
                    计算密集型的任务：核心线程数量=CPU的核数+1
                    IO密集型的任务：核心线程数量=CPU的核数+2
                 */
                
                //2.使用线程池处理Callable任务
                Future<String> f1 = pool.submit(new MyCallable(100));
                Future<String> f2 = pool.submit(new MyCallable(200));
                Future<String> f3 = pool.submit(new MyCallable(300));
                Future<String> f4 = pool.submit(new MyCallable(400));
                
                System.out.println(f1.get());
                System.out.println(f2.get());
                System.out.println(f3.get());
                System.out.println(f4.get());
            }
    }
