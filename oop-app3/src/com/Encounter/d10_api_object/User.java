package com.Encounter.d10_api_object;

/**
 * @author Encounter
 * @date 2024/6/20 20:00
 */

import java.util.Arrays;

/**
 * Cloneable是一个标记接口
 */
public class User implements Cloneable
    {
        private int id;
        private String username;
        private String password;
        private double[] scores;

        public User(int id, String username, String password, double[] scores)
            {
                this.id = id;
                this.username = username;
                this.password = password;
                this.scores = scores;
            }

        public User()
            {
            }

        public int getId()
            {
                return id;
            }

        public void setId(int id)
            {
                this.id = id;
            }

        public String getUsername()
            {
                return username;
            }

        public void setUsername(String username)
            {
                this.username = username;
            }

        public String getPassword()
            {
                return password;
            }

        public void setPassword(String password)
            {
                this.password = password;
            }

        public double[] getScores()
            {
                return scores;
            }

        public void setScores(double[] scores)
            {
                this.scores = scores;
            }

        //浅克隆
        /*@Override
        protected Object clone() throws CloneNotSupportedException
            {
                //super调用父类clone()方法
                return super.clone();
            }*/

        //深克隆
        @Override
        protected Object clone() throws CloneNotSupportedException
            {
                //super调用父类clone()方法
                User u2=(User) super.clone();
                u2.scores= u2.scores.clone();
                return u2;
            }

        @Override
        public String toString()
            {
                return "User{" +
                        "id=" + id +
                        ", username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        ", scores=" + Arrays.toString(scores) +
                        '}';
            }
    }
