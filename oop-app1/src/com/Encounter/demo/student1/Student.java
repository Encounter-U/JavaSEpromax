package com.Encounter.demo.student1;

/**
 * @author Encounter
 * @date 2024/6/17 20:08
 */
public class Student
    {
        private static String grand;//所有学生都是“尊享无忧”班级
        private String name;//姓名
        private int age;//年龄
        private int chineseScore;//语文成绩
        private int mathScore;//数学成绩

        public Student(String name, int age, int chineseScore, int mathScore)
            {
                this.name = name;
                this.age = age;
                this.chineseScore = chineseScore;
                this.mathScore = mathScore;
            }

        public Student()
            {
            }

        public static String getGrand()
            {
                return grand;
            }

        public static void setGrand(String grand)
            {
                Student.grand = grand;
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

        public int getChineseScore()
            {
                return chineseScore;
            }

        public void setChineseScore(int chineseScore)
            {
                this.chineseScore = chineseScore;
            }

        public int getMathScore()
            {
                return mathScore;
            }

        public void setMathScore(int mathScore)
            {
                this.mathScore = mathScore;
            }
    }
