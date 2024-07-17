package com.Encounter.d0_demo.test8_2.test3;

/**
 * @author Encounter
 * @date 2024/07/17 13:48<br/>
 */
public class RedPackets implements Runnable
    {
        private int num = 3;//红包数量
        
        @Override
        public void run()
            {
                String name = Thread.currentThread().getName();
                synchronized (this)
                    {
                        if (num > 0)
                            {
                                num--;
                                System.out.println("恭喜" + name + "，你成功抢到一个20元的红包");
                            }
                        else
                            System.out.println(name + "抱歉，红包已经被抢完了");
                    }
            }
    }
