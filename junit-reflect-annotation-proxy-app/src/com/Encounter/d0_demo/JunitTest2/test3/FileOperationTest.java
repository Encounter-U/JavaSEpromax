package com.Encounter.d0_demo.JunitTest2.test3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Encounter
 * @date 2024/07/20 14:28<br/>
 * 有一个fileOperation类，构造函数传入要操作的文件，并提供了一个readFile方法，可以读取指定文件的内容并返回<br/>
 * 请按要求编写测试方法<br/>
 * 1.使用JUnit来测试<br/>
 * 2.使用@Before 初始指定要读取的文件<br/>
 * 3.通过断言来判断readFile方法是否按预期工作<br/>
 * FileOperation的代码如下
 */
public class FileOperationTest
    {
        private FileOperation fo;
        
        @Before
        public void init()
            {
                String file = "junit-reflect-annotation-proxy-app/src/com/Encounter/d0_demo/JunitTest2/test3/b.txt";
                fo = new FileOperation(file);
            }
        
        @Test
        public void testReadFile()
            {
                String rs = fo.readFile();
                Assert.assertEquals("程序有BUG", null, rs);
            }
    }
