package com.Encounter.d9_modifer;

/**
 * @author Encounter
 * @date 2024/6/17 21:47
 */
public class Fu
    {
        //1.私有：只能在本类中访问
        private void privateMethod()
            {
                System.out.println("private");
            }

        //2.缺省：本类，同一个包下的类
        void method()
            {
                System.out.println("缺省");
            }

        //3.protected：本类，同一个包下的类，任意包下的子类
        protected void protectedMethod()
            {
                System.out.println("protected");
            }

        //4.public：本类，同一个包下的类，任意包下的子类，任意包下的任意类
        public void publicMethod()
            {
                System.out.println("public");
            }

        private void test()
            {
                privateMethod();
                method();
                protectedMethod();
                publicMethod();
            }
    }
