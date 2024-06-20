package com.Encounter.d10_modifer;

import com.Encounter.d9_modifer.Fu;

/**
 * @author Encounter
 * @date 2024/6/17 21:56
 */
public class Demo2
    {
        public static void main(String[] args)
            {
                Fu f=new Fu();
                //f.privateMethod();
                //f.method();
                //f.protectMethod();
                f.publicMethod();

                zi zi=new zi();
//                zi.protectMethod();//在任意包的子类里可访问，子类的对象不行
            }
    }
