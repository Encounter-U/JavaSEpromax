package com.Encounter.d14_extends_constructor;

/**
 * @author Encounter
 * @date 2024/6/18 13:48
 */

/**
 * 掌握在类的构造器中，通过this()调用兄弟构造器的作用
 */
public class Test3
    {
        public static void main(String[] args)
            {
                Student s1 = new Student("路明非", 22, "卡塞尔大学");
                System.out.println(s1);

                //需求：若未填写学校，默认是哥伦比亚大学
                Student s2 = new Student("楚子航", 23);

                System.out.println(s2);
            }
    }

class Student
    {
        private String name;
        private int age;
        private String schoolName;

        public Student(String name, int age)
            {
                /*this.name = name;
                this.age = age;
                this.schoolName = "哥伦比亚大学";*/
                this(name, age, "哥伦比亚大学");
            }

        public Student(String name, int age, String schoolName)
            {
                this.name = name;
                this.age = age;
                this.schoolName = schoolName;
            }

        public Student()
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

        public String getSchoolName()
            {
                return schoolName;
            }

        public void setSchoolName(String schoolName)
            {
                this.schoolName = schoolName;
            }

        @Override
        public String toString()
            {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", schoolName='" + schoolName + '\'' +
                        '}';
            }
    }
