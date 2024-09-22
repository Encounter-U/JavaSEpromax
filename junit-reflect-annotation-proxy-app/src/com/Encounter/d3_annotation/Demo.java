package com.Encounter.d3_annotation;

/**
 * @author Encounter
 * @date 2024/07/19 18:05<br/>
 */
@MyTest3
@MyTest4(value = "卡塞尔学院", aaa = 100000,bbb = {"装备部","研发部"})
public class Demo
    {
        @MyTest4(value = "路明非", bbb = {"Dragon"})
        public void test1()
            {
            
            }
    }
