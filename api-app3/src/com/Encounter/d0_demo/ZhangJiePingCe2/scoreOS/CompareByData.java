package com.Encounter.d0_demo.ZhangJiePingCe2.scoreOS;

/**
 * @author Encounter
 * @date 2024/6/23 14:49
 */
public class CompareByData
    {
        //根据语文成绩排名
        public static int rankByChineseScore(Student s1, Student s2)
            {
                return s2.getChineseScore() - s1.getChineseScore();
            }

        //根据数学成绩排名
        public static int rankByMathScore(Student s1, Student s2)
            {
                return s2.getMathScore() - s1.getMathScore();
            }

        //根据英语成绩排名
        public static int rankByEnglishScore(Student s1, Student s2)
            {
                return s2.getEnglishScore() - s1.getEnglishScore();
            }

        //根据总分排名
        public static int rankBySumScore(Student s1, Student s2)
            {
                return s2.sumScore() - s1.sumScore();
            }
    }
