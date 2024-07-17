package com.Encounter.d0_demo.test8_3.test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Encounter
 * @date 2024/07/17 15:49<br/>
 * 在开发过程中，为了提高执行效率，我们会使用线程中用于执行一系列任务;按照以下要求完成代码
 * ①在测试类中创建一个大小为3的线程池，并提交十个任务交给线程池执行
 * ②创建一个类实现Runnable 接口，重写run方法，在该方法中让线程睡眠2秒，并在睡眠前后打印分别打印一条信息
 */
public class Test
    {
        public static void main(String[] args)
            {
                ExecutorService pool = Executors.newFixedThreadPool(3);
                Runnable runnable = new MyRunnable();
                pool.execute(runnable);
                pool.execute(runnable);
                pool.execute(runnable);
                pool.execute(runnable);
                pool.execute(runnable);
                pool.execute(runnable);
                pool.execute(runnable);
                pool.execute(runnable);
                pool.execute(runnable);
                pool.execute(runnable);
            }
    }
