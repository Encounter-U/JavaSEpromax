package com.Encounter.d14_extends_constructor;

/**
 * @author Encounter
 * @date 2024/6/18 13:35
 */
public class Test2
    {
        public static void main(String[] args)
            {
                Teacher t = new Teacher("路明非", 22, "屠龙");
            }

    }

class Teacher extends People
    {
        private String skill;

        public Teacher()
            {
            }

        public Teacher(String name, int age, String skill)
            {
                super(name, age);
                this.skill = skill;
            }

        public String getSkill()
            {
                return skill;
            }

        public void setSkill(String skill)
            {
                this.skill = skill;
            }
    }

class People
    {
        private String name;
        private int age;

        public People(String name, int age)
            {
                this.name = name;
                this.age = age;
            }

        public People()
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
    }
