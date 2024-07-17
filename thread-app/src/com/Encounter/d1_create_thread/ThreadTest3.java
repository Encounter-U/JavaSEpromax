package com.Encounter.d1_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Encounter
 * @date 2024/07/16 16:05<br/>
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
public class ThreadTest3
    {
        public static void main(String[] args) throws ExecutionException, InterruptedException
            {
                //3.创建一个Callable的对象
                Callable<String> call = new MyCallable(100);
                
                //4.把Callable的对象封装成一个FutureTask对象（任务对象）
                //未来任务对象的作用？
                //1.是一个任务对象，实现了Runnable对象
                //2.可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果
                FutureTask<String> stringFutureTask = new FutureTask<>(call);
                
                //5.把任务对象交给一个Thread对象
                new Thread(stringFutureTask).start();
                
                //6.获取线程执行完毕之后返回的结果
                //注意：若执行到这里，上面的线程还未执行完毕
                //此处代码会暂停，等待上面线程执行完毕后才会获取结果
                String s = stringFutureTask.get();
                System.out.println(s);
            }
    }
