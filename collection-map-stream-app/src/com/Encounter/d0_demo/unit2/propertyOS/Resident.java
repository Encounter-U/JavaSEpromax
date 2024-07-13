package com.Encounter.d0_demo.unit2.propertyOS;

/**
 * @author Encounter
 * @date 2024/6/29 15:02
 */
public class Resident
    {
        private String name;
        private String phone;
        private int num;
        private double amount;

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

        public int getNum()
            {
                return num;
            }

        public void setNum(int num)
            {
                this.num = num;
            }

        public double getAmount()
            {
                return amount;
            }

        public void setAmount(double amount)
            {
                this.amount = amount;
            }

        public Resident(String name, String phone, int num, double amount)
            {
                this.name = name;
                this.phone = phone;
                this.num = num;
                this.amount = amount;
            }

        public Resident()
            {
            }

        @Override
        public String toString()
            {
                return "Resident{" +
                        "name='" + name + '\'' +
                        ", phone=" + phone +
                        ", num=" + num +
                        ", amount=" + amount +
                        '}';
            }
    }
