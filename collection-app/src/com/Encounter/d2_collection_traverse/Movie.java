package com.Encounter.d2_collection_traverse;

/**
 * @author Encounter
 * @date 2024/6/24 14:45
 */
public class Movie
    {
        private String name;
        private double score;
        private String actor;

        public Movie(String name, double score, String actor)
            {
                this.name = name;
                this.score = score;
                this.actor = actor;
            }

        public Movie()
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

        public double getScore()
            {
                return score;
            }

        public void setScore(double score)
            {
                this.score = score;
            }

        public String getActor()
            {
                return actor;
            }

        public void setActor(String actor)
            {
                this.actor = actor;
            }

        @Override
        public String toString()
            {
                return "Movie{" +
                        "name='" + name + '\'' +
                        ", score=" + score +
                        ", actor='" + actor + '\'' +
                        '}';
            }
    }
