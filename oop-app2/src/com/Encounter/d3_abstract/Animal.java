package com.Encounter.d3_abstract;

/**
 * @author Encounter
 * @date 2024/6/18 19:36
 */
public abstract class Animal
    {
        String name;

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public abstract void behavior();
    }
