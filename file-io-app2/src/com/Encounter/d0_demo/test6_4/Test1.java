package com.Encounter.d0_demo.test6_4;

import java.io.*;

/**
 * @author Encounter
 * @date 2024/7/3 15:48
 * <p/>
 * 在程序开发过程中，有些功能需要对文件进行备份，请在测试类中模拟该过程<br/>
 * ①将上一单元作业中创建的文本文件b.txt复制一份存储到当前项目下，并命名为c.txt<br/>
 * ②)使用try-catch-finally进行释放资源
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Reader fr = null;
                Writer fw = null;
                try
                    {
                        fr = new FileReader("file-io-app/src/b.txt");
                        fw = new FileWriter("file-io-app2/src/c.txt");

                        char[] buffer = new char[3];
                        int len;
                        while ((len = fr.read(buffer)) != -1)
                            {
                                fw.write(new String(buffer, 0, len));
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
                finally
                    {
                        if (fw != null)
                            {
                                try
                                    {
                                        fw.close();
                                    }
                                catch (IOException e)
                                    {
                                        throw new RuntimeException(e);
                                    }
                            }
                        if (fr!=null)
                            {
                                try
                                    {
                                        fr.close();
                                    }
                                catch (IOException e)
                                    {
                                        throw new RuntimeException(e);
                                    }
                            }
                    }
            }
    }
