package com.Encounter.d7_thread_communication;

/**
 * @author Encounter
 * @date 2024/07/17 00:12<br/>
 * <pre>
 *      目标：了解线程通信（了解即可）
 *      需求：3个生产者线程负责生产包子，每个线程每次只能生产1个包子放在桌子上
 *           2个消费者线程负责吃包子，每人每次只能从桌子上拿一个包子吃
 * </pre>
 */
public class ThreadTest
    {
        public static void main(String[] args)
            {
                //桌子
                Desk desk = new Desk();
                
                //三个生产者线程
                new Thread(() ->
                    {
                        while (true)
                            {
                                desk.put();
                            }
                    }, "生产者1").start();
                
                new Thread(() ->
                    {
                        while (true)
                            {
                                desk.put();
                            }
                    }, "生产者2").start();
                
                new Thread(() ->
                    {
                        while (true)
                            {
                                desk.put();
                            }
                    }, "生产者3").start();
                
                //两个消费者线程
                new Thread(() ->
                    {
                        while (true)
                            {
                                desk.eat();
                            }
                    }, "消费者1").start();
                
                new Thread(() ->
                    {
                        while (true)
                            {
                                desk.eat();
                            }
                    }, "消费者2").start();
                
            }
    }
