package com.Encounter.d7_thread_communication;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Encounter
 * @date 2024/07/17 00:16<br/>
 */
public class Desk
    {
        private List<String> list = new ArrayList<>();
        
        public synchronized void put()
            {
                try
                    {
                        String name = Thread.currentThread().getName();
                        if (list.isEmpty())
                            {
                                list.add(name + "做的包子");
                                System.out.println(name + "在桌子上放了一个包子");
                                Thread.sleep(2000);
                                
                                //等待自己
                                this.notifyAll();
                                this.wait();
                            }
                        else
                            {
                                System.out.println(name+"想做包子，但是发现已经有了，就不做了");
                                
                                this.notifyAll();
                                this.wait();
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
        
        public synchronized void eat()
            {
                try
                    {
                        String name = Thread.currentThread().getName();
                        if (!list.isEmpty())
                            {
                                System.out.println(name + "在桌子上拿了一个"+list.get(0));
                                list.remove(0);
                                Thread.sleep(2000);
                                
                                this.notifyAll();
                                this.wait();
                            }
                        else
                            {
                                System.out.println(name + "想拿包子，但是暂时没包子了");
                                
                                this.notifyAll();
                                this.wait();
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
