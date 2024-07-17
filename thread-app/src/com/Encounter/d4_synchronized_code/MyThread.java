package com.Encounter.d4_synchronized_code;

/**
 * @author Encounter
 * @date 2024/07/16 23:09<br/>
 */
public class MyThread extends Thread
    {
        
        private Account account;
        public MyThread(Account account)
            {
                this.account = account;
            }
        @Override
        public void run()
            {
                account.drawMoney(100000);
            }
    }
