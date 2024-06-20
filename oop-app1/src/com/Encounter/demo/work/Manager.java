package com.Encounter.demo.work;

/**
 * @author Encounter
 * @date 2024/6/18 14:11
 */
public class Manager extends Employee
    {
        private double bonus;

        public Manager(String name, String id, double salary, double bonus)
            {
                super(name, id, salary);
                this.bonus = bonus;
            }

        public Manager()
            {
            }

        public double getBonus()
            {
                return bonus;
            }

        public void setBonus(double bonus)
            {
                this.bonus = bonus;
            }

        @Override
        public String work()
            {
                return super.work() + "，奖金为：" + bonus + "，的经理正在会见客户";
            }
    }
