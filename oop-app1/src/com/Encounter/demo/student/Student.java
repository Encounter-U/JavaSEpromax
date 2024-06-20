package com.Encounter.demo.student;

/**
 * @author Encounter
 * @date 2024/6/17 19:50
 */
public class Student
    {
        private String grand;//班级
        private String name;//姓名
        private int age;//年龄
        private String birthday;//生日

        public Student()
            {
            }

        public Student(String grand, String name, int age, String birthday)
            {
                this.grand = grand;
                this.name = name;
                this.age = age;
                this.birthday = birthday;
            }

        public String getGrand()
            {
                return grand;
            }

        public void setGrand(String grand)
            {
                this.grand = grand;
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

        public String getBirthday()
            {
                return birthday;
            }

        public void setBirthday(String birthday)
            {
                this.birthday = birthday;
            }
    }
