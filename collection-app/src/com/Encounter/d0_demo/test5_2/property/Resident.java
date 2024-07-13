package com.Encounter.d0_demo.test5_2.property;

/**
 * @author Encounter
 * @date 2024/6/25 15:51
 */
public class Resident
    {
        private String name;
        private String phone;
        private int number;
        private double money;

        public Resident(String name, String phone, int number, double money)
            {
                this.name = name;
                this.phone = phone;
                this.number = number;
                this.money = money;
            }

        public Resident()
            {
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public String getPhone()
            {
                return phone;
            }

        public void setPhone(String phone)
            {
                this.phone = phone;
            }

        public int getNumber()
            {
                return number;
            }

        public void setNumber(int number)
            {
                this.number = number;
            }

        public double getMoney()
            {
                return money;
            }

        public void setMoney(double money)
            {
                this.money = money;
            }

        @Override
        public String toString()
            {
                return "Resident{" +
                        "name='" + name + '\'' +
                        ", phone=" + phone +
                        ", number=" + number +
                        ", money=" + money +
                        '}';
            }
    }
