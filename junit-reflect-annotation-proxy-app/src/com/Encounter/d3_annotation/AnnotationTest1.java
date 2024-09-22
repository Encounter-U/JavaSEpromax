package com.Encounter.d3_annotation;

/**
 * @author Encounter
 * @date 2024/07/19 17:37<br/>
 */

//@MyTest1(aaa = "路明非",bbb = {"楚子航","夏弥"})
//@MyTest2(value = "路明非")
@MyTest2("路明非")
public class AnnotationTest1
    {
        public static void main(String[] args)
            {
            
            }
        
        @MyTest1(aaa = "上杉绘梨衣", bbb = {}, ccc = false)
        public void test1()
            {
            
            }
    }
