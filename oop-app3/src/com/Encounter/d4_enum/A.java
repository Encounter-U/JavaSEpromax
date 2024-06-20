package com.Encounter.d4_enum;

//枚举类
public enum A
    {
        //常量，每个常量都是记住枚举类的一个对象的
        X, Y, Z;

        private String name;

        //构造方法默认用private修饰，且无法被修改
        A()
            {
            }

        A(String name)
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }
    }
