package com.Encounter.demo.game;

/**
 * @author Encounter
 * @date 2024/6/18 21:01
 */
public class Magician extends Role
    {
        private int magicLevel;

        public Magician(String name, int magicLevel)
            {
                super(name);
                this.magicLevel = magicLevel;
            }

        public Magician()
            {
            }

        public int getMagicLevel()
            {
                return magicLevel;
            }

        public void setMagicLevel(int magicLevel)
            {
                this.magicLevel = magicLevel;
            }

        @Override
        public int attack()
            {
                return 5 * magicLevel;
            }
    }
