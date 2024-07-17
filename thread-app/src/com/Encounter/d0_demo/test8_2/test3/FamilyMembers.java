package com.Encounter.d0_demo.test8_2.test3;

/**
 * @author Encounter
 * @date 2024/07/17 13:49<br/>
 * 某家庭聚会组织了"抢红包"的活动，现在某家庭成员打算发3个定额红包[3个20元红包]，现由5个家庭成员进行快抢，请使用多线程模拟该活动!
 * ①定义一个类，实现Runnable接
 * ②在该类中定义一个int类型的变量，初始值为3，表示3个红包
 * ③重写Runnable接口中的run方法run方法的实现逻辑如下所示:
 * 判断红包的总数量是否大于0，如果是在控制台输出"恭喜xxx，你成功抢到一个20元的红包"，红包总数量减
 * 如果红包的总数量小于等于0，此时在控制台输出"xxx抱歉，红包已经被抢完了
 * “黄药师”
 * “瑛姑”
 * ④在测试类中创建5个线程模拟5个家庭成员，并分别命名为“黄蓉”，“郭靖”
 * “周伯通”
 * ⑤在测试类中启动5个线程
 */
public class FamilyMembers
    {
        public static void main(String[] args)
            {
                RedPackets rp = new RedPackets();
                Thread t1 = new Thread(rp,"黄蓉");
                Thread t2 = new Thread(rp,"郭靖");
                Thread t3 = new Thread(rp,"黄药师");
                Thread t4 = new Thread(rp,"周伯通");
                Thread t5 = new Thread(rp,"瑛姑");
                
                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();
            }
    }
