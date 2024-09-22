package com.Encounter.d1_junit;

import org.junit.*;

/**
 * @author Encounter
 * @date 2024/07/19 12:17<br/>
 * 测试类
 */
public class StringUtilTest
    {
        @BeforeClass
        public static void test3()
            {
                System.out.println("=====test3 BeforeClass======");
            }

        @AfterClass
        public static void test4()
            {
                System.out.println("======test4 AfterClass======");
            }

        @Before
        public void test1()
            {
                System.out.println("=====test1 Before======");
            }

        @After
        public void test2()
            {
                System.out.println("======test2 After======");
            }
        
        @Test//测试方法
        public void testPrintNumber()
            {
                StringUtil.printNumber("路明非");
                StringUtil.printNumber(null);
            }
        
        @Test//测试方法
        public void testGetMaxIndex()
            {
                int maxIndex = StringUtil.getMaxIndex(null);
                System.out.println(maxIndex);
                
                int maxIndex1 = StringUtil.getMaxIndex("路明非");
                System.out.println(maxIndex1);
                
                //断言机制，程序员可以通过预测业务方法的结果
                Assert.assertEquals("方法内部有BUG",2,maxIndex1);
            }
    }
