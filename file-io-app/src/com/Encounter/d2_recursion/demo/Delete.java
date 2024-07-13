package com.Encounter.d2_recursion.demo;

import java.io.File;

/**
 * @author Encounter
 * @date 2024/7/1 15:17
 */
public class Delete
    {
        public static void main(String[] args)
            {
                delete(new File("E:\\XiaomiCloud\\Desktop\\博学谷\\File\\test"));
            }

        public static void delete(File file)
            {
                File[] files = file.listFiles();
                if (files != null)
                    {
                        for (File f : files)
                            {
                                if (f.isFile())
                                    f.delete();
                                else
                                    delete(f);
                            }
                    }
                System.out.println(file.delete());
            }
    }
