package com.Encounter.d0_demo.object_objects;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/20 20:58
 */
public class Person implements Cloneable
    {
        private String name;
        private int age;

        public Person(String name, int age)
            {
                this.name = name;
                this.age = age;
            }

        public Person()
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

        public int getAge()
            {
                return age;
            }

        public void setAge(int age)
            {
                this.age = age;
            }

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Person person = (Person) o;
                return age == person.age && Objects.equals(name, person.name);
            }

        @Override
        public String toString()
            {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }

        @Override
        protected Object clone() throws CloneNotSupportedException
            {
                return super.clone();
            }
    }
