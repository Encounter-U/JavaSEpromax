package com.Encounter.d6_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Encounter
 * @date 2024/07/16 23:03<br/>
 */
public class Account
    {
        private final Lock lock = new ReentrantLock();//创建一个锁对象,加上final，避免二次赋值
        private double money;//余额
        private String cardId;//卡号
        
        public Account(double money, String cardId)
            {
                this.money = money;
                this.cardId = cardId;
            }
        
        public Account()
            {
            }
        
        /**
         * 静态方法用 类名.class
         */
        public synchronized static void test()
            {
            }
        
        public double getMoney()
            {
                return money;
            }
        
        public void setMoney(double money)
            {
                this.money = money;
            }
        
        public String getCardId()
            {
                return cardId;
            }
        
        public void setCardId(String cardId)
            {
                this.cardId = cardId;
            }
        
        public void drawMoney(double money)
            {
                try
                    {
                        String name = Thread.currentThread().getName();
                        lock.lock();//加锁
                        if (this.money >= money)
                            {
                                System.out.println(name + "成功取走" + money + "元");
                                this.money -= money;
                                System.out.println(name + "账户余额为：" + this.money);
                            }
                        else
                            System.out.println("余额不足");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
                finally
                    {
                        //避免程序出现bug导致无法解锁
                        lock.unlock();//解锁
                    }
                
            }
    }
