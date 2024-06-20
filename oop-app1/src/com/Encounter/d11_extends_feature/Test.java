package com.Encounter.d11_extends_feature;

/**
 * @author Encounter
 * @date 2024/6/18 11:50
 */

/**
 * 掌握继承的两个注意事项
 * 1.Java是单继承的，一个类只能继承一个直接父类；Java中的类不支持多继承，但支持多层继承
 * 2.Object类是Java中所有类的祖宗
 */
public class Test
    {
        public static void main(String[] args)
            {
//Object
            }
    }

class A
    {
    }

class B extends A
    {
    }

//class C extends A,B{}
class D extends B
    {
    }
