package com.Encounter.d6_singleInstance;

/**
 * @author Encounter
 * @date 2024/6/17 21:10
 */
public class B
    {
        //2.定义一个类变量，用于存储这个类的一个对象
        private static B b;

        //1.私有类的构造器
        private B()
            {
            }

        //3.定义一个类方法，该方法要保证第一次调用才创建一个对象，后面调用时都会用这一个对象返回
        public static B getInstance()
            {
                if (b == null)
                    b = new B();
                return b;
            }
    }
