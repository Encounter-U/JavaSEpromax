package com.Encounter.d9_interface_attention;

/**
 * @author Encounter
 * @date 2024/6/19 15:12
 */

interface A
    {
        void test1();
    }

interface B
    {
        void test2();
    }

interface C
    {
        void test3();
    }

interface D extends C, B, A
    {
    }

/**
 * 理解接口多继承
 */
public class Test
    {
        public static void main(String[] args)
            {

            }
    }

class E implements D
    {
        @Override
        public void test1()
            {

            }

        @Override
        public void test2()
            {

            }

        @Override
        public void test3()
            {

            }
    }