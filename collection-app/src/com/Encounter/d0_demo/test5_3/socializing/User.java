package com.Encounter.d0_demo.test5_3.socializing;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/26 15:46
 */
public class User
    {
        private int ID;
        private String name;

        public User(int ID, String name)
            {
                this.ID = ID;
                this.name = name;
            }

        public User()
            {
            }

        public int getID()
            {
                return ID;
            }

        public void setID(int ID)
            {
                this.ID = ID;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        @Override
        public String toString()
            {
                return "User{" +
                        "ID=" + ID +
                        ", name='" + name + '\'' +
                        '}';
            }

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                User user = (User) o;
                return ID == user.ID && Objects.equals(name, user.name);
            }

        @Override
        public int hashCode()
            {
                return Objects.hash(ID, name);
            }
    }
