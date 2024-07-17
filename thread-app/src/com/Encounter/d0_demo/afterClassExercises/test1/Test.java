package com.Encounter.d0_demo.afterClassExercises.test1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Encounter
 * @date 2024/07/16 20:57<br/>
 * 创建一个测试类，模拟定时任务功能<br/>
 * ①使用实现Callable接口接口的方式创建一个线程<br/>
 * ②)重写call0)方法，在方法中每3秒在控制台输出 当前时间戳，输出10次进程停止<br/>
 * ③在主方法中启动该线程
 */
public class Test
    {
        public static void main(String[] args) throws ExecutionException, InterruptedException
            {
                Callable<Long> c = new MyCallable();
                FutureTask<Long> dateFutureTask = new FutureTask<>(c);
                new Thread(dateFutureTask).start();
                System.out.println(dateFutureTask.get());
                
            }
    }
