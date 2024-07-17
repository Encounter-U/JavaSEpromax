package com.Encounter.d1_create_thread;

/**
 * @author Encounter
 * @date 2024/07/16 12:14<br/>
 * 目标：掌握多线程创建方式二的匿名内部类写法
 */
public class ThreadTest2_2
    {
        public static void main(String[] args)
            {
                //1.直接创建Runnable接口的匿名内部类形式（任务对象）
                Runnable runnable = new Runnable()
                    {
                        @Override
                        public void run()
                            {
                                for (int i = 0; i < 5; i++)
                                    {
                                        System.out.println("子线程1输出"+i);
                                    }
                            }
                    };
                new Thread(runnable).start();
                
                //简化形式1：
                new Thread(new Runnable()
                    {
                        @Override
                        public void run()
                            {
                                for (int i = 0; i < 5; i++)
                                    {
                                        System.out.println("子线程2输出"+i);
                                    }
                            }
                    }).start();
                
                //简化形式2：
                new Thread(() ->
                    {
                        for (int i = 0; i < 5; i++)
                            System.out.println("子线程3输出" + i);
                    }).start();
                
                for (int i = 0; i < 5; i++)
                    {
                        System.out.println("主线程main输出"+i);
                    }
                
            }
    }
