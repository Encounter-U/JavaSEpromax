package com.Encounter.d3_thread_safe;

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
                if (this.money >= money)
                    {
                        this.money -= money;
                        System.out.println(name + "成功取走" + money + "元，账户余额为：" + this.money);
                    }
                else
                    System.out.println("余额不足");
            }
    }
