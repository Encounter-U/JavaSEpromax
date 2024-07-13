package com.Encounter.d11_api_objects;

/**
 * @author Encounter
 * @date 2024/6/20 20:22
 */

import java.util.Objects;

/**
 * 掌握Objects类提供的常用方法
 */
public class Test
    {
        public static void main(String[] args)
            {
                String s1=null;
                String s2="路明非";
                //System.out.println(s1.equals(s2));
                System.out.println(Objects.equals(s1,s2));//更安全

                System.out.println(Objects.isNull(s1));//等同于用s1==null来判断，但这样更有b格
                System.out.println(Objects.isNull(s2));

                System.out.println(Objects.nonNull(s1));
                System.out.println(Objects.nonNull(s2));
            }
    }
