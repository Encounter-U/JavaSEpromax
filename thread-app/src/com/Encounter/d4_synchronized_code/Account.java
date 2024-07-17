package com.Encounter.d4_synchronized_code;

/**
 * @author Encounter
 * @date 2024/07/16 23:03<br/>
 */
public class Account
    {
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
        public static void test()
            {
                synchronized (Account.class){
                
                }
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
                String name = Thread.currentThread().getName();
                //this代表当前共享资源
                synchronized (this){
                    if (this.money >= money)
                        {
                            this.money -= money;
                            System.out.println(name + "成功取走" + money + "元，账户余额为：" + this.money);
                        }
                    else
                        System.out.println("余额不足");
                }
            }
    }
