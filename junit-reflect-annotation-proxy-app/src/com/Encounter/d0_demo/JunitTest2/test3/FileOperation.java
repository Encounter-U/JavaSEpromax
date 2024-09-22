package com.Encounter.d0_demo.JunitTest2.test3;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Encounter
 * @date 2024/07/20 14:27<br/>
 * 有一个fileOperation类，构造函数传入要操作的文件，并提供了一个readFile方法，可以读取指定文件的内容并返回<br/>
 * 请按要求编写测试方法<br/>
 * 1.使用JUnit来测试<br/>
 * 2.使用@Before 初始指定要读取的文件<br/>
 * 3.通过断言来判断readFile方法是否按预期工作<br/>
 * FileOperation的代码如下
 */
public class FileOperation
    {
        
        private String file;
        
        public FileOperation(String file)
            {
                this.file = file;
            }
        
        public String readFile()
            {
                String content = null;
                try
                    {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        while ((content = reader.readLine()) != null)
                            {
                            }
                        reader.close();
                    }
                catch (Exception e)
                    {
                    }
                return content;
            }
        
    }
