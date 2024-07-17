package com.Encounter.d0_demo.afterClassExercises.test3;

/**
 * @author Encounter
 * @date 2024/07/16 22:49<br/>
 * 通过实现Runnable接口的形式创建线程，实现如下要求<br/>
 * 1.每隔3秒打印当前线程的名称和当前的时间戳，打印10次<br/>
 * 2.设置线程名称为:测试线程<br/>
 * 3.在测试方法中等待线程执行结束
 */
public class Test
    {
        public static void main(String[] args)
            {
                Runnable r=new MyRunnable("测试线程");
                Thread t=new Thread(r);
                t.start();
            }
    }
