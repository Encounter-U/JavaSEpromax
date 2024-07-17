package com.Encounter.d1_create_thread;

import java.util.concurrent.Callable;

/**
 * @author Encounter
 * @date 2024/07/16 16:06<br/>
 * <pre>
 * 目标：掌握线程的创建方式三：实现Callable接口
 * 1.让该类实现Callable接口
 * 2.重写call方法
 * 3.创建一个Callable的对象
 * 4.把Callable的对象封装成一个FutureTask对象（任务对象）
 *      1.是一个任务对象，实现了Runnable对象
 *      2.可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果
 * 5.把任务对象交给一个Thread对象
 * 6.获取线程执行完毕之后返回的结果</pre>
 */
public class MyCallable implements Callable<String>
    {
        //接收变量
        private final int n;
        
        public MyCallable(int n)
            {
                this.n = n;
            }
        
        //2.重写call方法
        @Override
        public String call() throws Exception
            {
                //描述线程的任务，返回线程执行后返回的结果
                //需求：求1~n的和并返回
                int sum = 0;
                for (int i = 0; i < n; i++)
                    {
                        sum += n;
                    }
                return "线程求出1到" + n + "的和为" + sum;
            }
    }
