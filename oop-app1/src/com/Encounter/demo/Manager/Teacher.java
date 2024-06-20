package com.Encounter.demo.Manager;

/**
 * @author Encounter
 * @date 2024/6/17 22:04
 */
public class Teacher extends Person
    {
        private String object;

        public String getObject()
            {
                return object;
            }

        public void setObject(String object)
            {
                this.object = object;
            }

        public void teach()
            {
                System.out.println(getName() + "老师，讲授" + object + "课");
            }
    }
