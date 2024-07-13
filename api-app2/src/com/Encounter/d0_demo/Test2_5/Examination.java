package com.Encounter.d0_demo.Test2_5;

/**
 * @author Encounter
 * @date 2024/6/22 10:42
 */
public class Examination
    {
        private String name;
        private int score;

        public Examination(String name, int score)
            {
                this.name = name;
                this.score = score;
            }

        public Examination()
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

        public int getScore()
            {
                return score;
            }

        public void setScore(int score)
            {
                this.score = score;
            }

    }
