package com.Encounter.d0_demo.ZhangJiePingCe2.scoreOS;

/**
 * @author Encounter
 * @date 2024/6/23 14:36
 */
public class Student
    {
        private String name;
        private int chineseScore;
        private int mathScore;
        private int englishScore;

        public Student(String name, int chineseScore, int mathScore, int englishScore)
            {
                this.name = name;
                this.chineseScore = chineseScore;
                this.mathScore = mathScore;
                this.englishScore = englishScore;
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

        public int getEnglishScore()
            {
                return englishScore;
            }

        public void setEnglishScore(int englishScore)
            {
                this.englishScore = englishScore;
            }

        //查询总分
        public int sumScore()
            {
                return chineseScore+mathScore+englishScore;
            }

        @Override
        public String toString()
            {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", chineseScore=" + chineseScore +
                        ", mathScore=" + mathScore +
                        ", englishScore=" + englishScore +
                        ", sumScore="+sumScore()+
                        '}'+"\n";
            }
    }
