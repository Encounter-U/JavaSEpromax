package com.Encounter.d8_thread_pool;

import java.util.concurrent.*;

/**
 * @author Encounter
 * @date 2024/07/17 14:34<br/>
 * 目标：掌握线程池的创建
 */
public class ThreadPoolTest1
    {
        public static void main(String[] args)
            {
                //1.通过ThreadPoolExecutor创建一个线程池对象
                /*
                  public ThreadPoolExecutor(int corePoolSize,
                                                int maximumPoolSize,
                                                long keepAliveTime,
                                                TimeUnit unit,
                                                BlockingQueue<Runnable> workQueue,
                                                ThreadFactory threadFactory,
                                                RejectedExecutionHandler handler)
                 */
                ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                        TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                        //new ThreadPoolExecutor.AbortPolicy());//拒绝任务，抛出异常，默认策略
                        //new ThreadPoolExecutor.DiscardOldestPolicy());//丢弃任务，但不抛出异常，不推荐
                        //new ThreadPoolExecutor.DiscardOldestPolicy());//抛弃队列中等待最久的任务，然后把当前任务加入到队列中
                        new ThreadPoolExecutor.CallerRunsPolicy());//由主线程负责调用任务的run方法从而绕过线程池直接执行
                
                Runnable r = new MyRunnable();
                pool.execute(r);//线程池会自动创建一个新线程，自动处理这个任务，自动执行
                pool.execute(r);//线程池会自动创建一个新线程，自动处理这个任务，自动执行
                pool.execute(r);//线程池会自动创建一个新线程，自动处理这个任务，自动执行
                //这四个在任务队列
                pool.execute(r);//复用前面的核心线程
                pool.execute(r);//复用前面的核心线程
                pool.execute(r);//复用前面的核心线程
                pool.execute(r);//复用前面的核心线程
                //任务队列已满，创建临时线程
                pool.execute(r);//复用前面的核心线程
                pool.execute(r);//复用前面的核心线程
                //到了新任务拒绝的时机了
                pool.execute(r);//复用前面的核心线程
                
                //pool.shutdown();//等着线程池的任务全部执行完毕后，再关闭线程池
                
                //pool.shutdownNow();//立即关闭线程池，不论任务是否执行完毕
            }
    }
