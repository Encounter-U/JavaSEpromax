package com.Encounter.demo.person;

/**
 * @author Encounter
 * @date 2024/6/18 16:11
 */
public class Person
    {
        private String name;
        private int age;
        private String address;

        public Person(String name, int age, String address)
            {
                this.name = name;
                this.age = age;
                this.address = address;
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

        public String getAddress()
            {
                return address;
            }

        public void setAddress(String address)
            {
                this.address = address;
            }

        public String info()
            {
                return name + "年龄：" + age + "住址：" + address;
            }
    }
