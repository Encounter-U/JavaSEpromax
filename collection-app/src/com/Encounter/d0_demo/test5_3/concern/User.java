package com.Encounter.d0_demo.test5_3.concern;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/26 16:25
 */
public class User
    {
        private String name;

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public User(String name)
            {
                this.name = name;
            }

        public User()
            {
            }

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                User user = (User) o;
                return Objects.equals(name, user.name);
            }

        @Override
        public int hashCode()
            {
                return Objects.hash(name);
            }
    }
