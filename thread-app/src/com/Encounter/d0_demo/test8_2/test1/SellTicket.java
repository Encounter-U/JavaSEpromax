package com.Encounter.d0_demo.test8_2.test1;

/**
 * @author Encounter
 * @date 2024/07/17 10:15<br/>
 */
public class SellTicket implements Runnable
    {
        private int tickets = 100;
        
        @Override
        public void run()
            {
                while (tickets > 0)
                    {
                        sell();
                    }
            }
        
        private synchronized void sell()
            {
                try
                    {
                        String name = Thread.currentThread().getName();
                        if (tickets > 0)
                            {
                                System.out.println(name + "卖出一张票，余票还有：" + (--tickets));
                                this.notifyAll();
                                this.wait();
                            }
                        if (tickets <= 0)
                            {
                                System.out.println(name + "余票售罄");
                                this.notifyAll();
                            }
                        
                    }
                catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
