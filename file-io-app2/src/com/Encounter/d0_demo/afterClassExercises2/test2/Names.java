package com.Encounter.d0_demo.afterClassExercises2.test2;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/7/13 15:13<p/>
 * 现获取到一些人员的姓名信息，存储在ArrayList集合中，如下:<br/>
 * ArrayList<String> list = new ArrayList<>();<br/>
 * list.add("Tom");<br/>
 * list.add("Jerry");<br/>
 * list.add("Lucy");<br/>
 * list.add("Lily");<br/>
 * list.add("John");<br/>
 * list.add("Kevin");<br/>
 * 请编程程序，将这些信息保存至当前模块下的name.txt文件中，每个名字占据一行的位置<br/>
 * ##【思路分析】<br/>
 * 1、需要将字符数据写入文件，并且需要换行，可以采用哪个流完成?<br/>
 * 2、怎样写入字符数据?<br/>
 * ##【参考步骤】:<br/>
 * 1、创建集合并将数据添加到集合中<br/>
 * 2、创建字符缓冲输出流对象<br/>
 * 3、遍历集合得到每个字符串<br/>
 * 4、调用字符缓冲输出流对象的方法写数据<br/>
 * 5、释放资源
 */
public class Names
    {
        public static void main(String[] args)
            {
                try (PrintStream oos = new PrintStream(
                        new FileOutputStream(
                                "file-io-app2/src/com/Encounter/d0_demo/afterClassExercises2/test2/name.txt",
                                true)))
                    {
                        ArrayList<String> list=new ArrayList<>();
                        list.add("路明非");
                        list.add("楚子航");
                        list.add("夏弥");
                        list.add("上杉绘梨衣");
                        for (String s : list)
                            {
                                oos.println(s);
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
