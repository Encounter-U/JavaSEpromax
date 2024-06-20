package com.Encounter.d6_interface2;

/**
 * @author Encounter
 * @date 2024/6/19 12:27
 */

interface Driver
    {
        void driver();
    }

interface Singer
    {
        void sing();
    }

/**
 * 搞清楚接口的好处
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student s = new A();
                Driver d = new A();
                d.driver();
                Singer singer = new A();
                singer.sing();
                Driver d1 = new B();
                d1.driver();
            }
    }

class A extends Student implements Driver, Singer
    {

        @Override
        public void driver()
            {

            }

        @Override
        public void sing()
            {

            }
    }

class B implements Driver
    {
        @Override
        public void driver()
            {

            }
    }

class Student
    {
    }