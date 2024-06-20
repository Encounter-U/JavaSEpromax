package com.Encounter.demo.Manager;

/**
 * @author Encounter
 * @date 2024/6/17 22:04
 */
public class Student extends Person
    {
        int score;

        public int getScore()
            {
                return score;
            }

        public void setScore(int score)
            {
                this.score = score;
            }

        public void test()
            {
                System.out.println(getName() + "同学，考试得了：" + score + "分");
            }
    }
