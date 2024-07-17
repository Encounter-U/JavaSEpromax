package com.Encounter.d0_demo.test8_2.test2;

/**
 * @author Encounter
 * @date 2024/07/17 10:18<br/>
 * 某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
 * ①)定义一个类SellTicket实现Runnable接口，里面定义一个成员变量:private int tickets = 100;
 * ②在SellTicket类中重写run()方法实现卖票，代码步骤如下
 * ③判断票数大于0，就卖票，并告知是哪个窗口卖的，卖了票之后，总票数要减1，票卖没了，线程停止
 * 4定义一个测试类SellTicketDemo，里面有main方法，代码步骤如下
 * ⑤创建SelTicket类的对象，创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称，启动线程
 */
public class SellTickDemo
    {
        public static void main(String[] args)
            {
                Runnable r = new SellTicket();
                Thread t1 = new Thread(r, "窗口A");
                Thread t2 = new Thread(r, "窗口B");
                Thread t3 = new Thread(r, "窗口C");
                
                t1.start();
                t2.start();
                t3.start();
                
                
            }
    }
