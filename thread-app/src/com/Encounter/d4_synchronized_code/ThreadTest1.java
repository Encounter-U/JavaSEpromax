package com.Encounter.d4_synchronized_code;

/**
 * @author Encounter
 * @date 2024/07/16 23:03<br/>
 * 目标：线程安全问题解决，同步代码块
 */
public class ThreadTest1
    {
        public static void main(String[] args)
            {
                //1.创建一个账户对象，代表两人的共享账户
                Account account = new Account(100000, "Dragon");
                
                //2.创建两个线程代表两个取钱对象
                Thread t1 = new MyThread(account);
                t1.setName("路明非");
                Thread t2 = new MyThread(account);
                t2.setName("楚子航");
                
                t1.start();
                t2.start();
            }
    }
