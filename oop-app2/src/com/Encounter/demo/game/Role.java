package com.Encounter.demo.game;

/**
 * @author Encounter
 * @date 2024/6/18 20:59
 */
public abstract class Role
    {
        private String name;

        public Role(String name)
            {
                this.name = name;
            }

        public Role()
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

        public abstract int attack();
    }
