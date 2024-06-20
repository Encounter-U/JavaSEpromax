package com.Encounter.d8_extends_application;

/**
 * @author Encounter
 * @date 2024/6/17 21:38
 */
public class Teacher extends People
    {
        private String skill;

        public String getSkill()
            {
                return skill;
            }

        public void setSkill(String skill)
            {
                this.skill = skill;
            }

        public void printInfo()
            {
                System.out.println(getName() + "  " + skill);
            }
    }
