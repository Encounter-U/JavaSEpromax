package com.Encounter.d6_object_stream;

import java.io.Serializable;

/**
 * @author Encounter
 * @date 2024/7/12 17:14<p/>
 * 注意：对象如果需要序列化，必须实现序列化接口
 */

public class User implements Serializable
    {
        private String loginName;
        private String userName;
        private int age;
        //transient 该成员变量不参与序列化
        private transient String password;

        public User(String loginName, String userName, int age, String password)
            {
                this.loginName = loginName;
                this.userName = userName;
                this.age = age;
                this.password = password;
            }

        public User()
            {
            }

        public String getLoginName()
            {
                return loginName;
            }

        public void setLoginName(String loginName)
            {
                this.loginName = loginName;
            }

        public String getUserName()
            {
                return userName;
            }

        public void setUserName(String userName)
            {
                this.userName = userName;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge(int age)
            {
                this.age = age;
            }

        public String getPassword()
            {
                return password;
            }

        public void setPassword(String password)
            {
                this.password = password;
            }

        @Override
        public String toString()
            {
                return "User{" +
                        "loginName='" + loginName + '\'' +
                        ", userName='" + userName + '\'' +
                        ", age=" + age +
                        ", password='" + password + '\'' +
                        '}';
            }
    }
