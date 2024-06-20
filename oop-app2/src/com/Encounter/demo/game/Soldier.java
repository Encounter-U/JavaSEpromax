package com.Encounter.demo.game;

/**
 * @author Encounter
 * @date 2024/6/18 21:01
 */
public class Soldier extends Role
    {
        private int attackPower;

        public Soldier(String name, int attackPower)
            {
                super(name);
                this.attackPower = attackPower;
            }

        public Soldier()
            {
            }

        public int getAttackPower()
            {
                return attackPower;
            }

        public void setAttackPower(int attackPower)
            {
                this.attackPower = attackPower;
            }

        @Override
        public int attack()
            {
                return attackPower;
            }
    }
