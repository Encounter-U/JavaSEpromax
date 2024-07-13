package com.Encounter.d7_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Encounter
 * @date 2024/7/12 20:58<p/>
 * 目标：使用CommonsIO框架进行IO相关的操作
 */
public class CommonsIOTest1
    {
        public static void main(String[] args) throws IOException
            {
                /*FileUtils.copyFile(new File("file-io-app2/src/test7.txt"),
                        new File("file-io-app2/src/test7_copy.txt"));

                FileUtils.copyDirectory(new File("D:\\图片\\原神"),new File("D:\\图片\\原p"));

                FileUtils.deleteDirectory(new File("D:\\图片\\原p"));*/

                //Java原生的
                //Files.copy(Path.of("file-io-app2/src/test7.txt"),Path.of("file-io-app2/src/test7_copy_java.txt"));
                System.out.println(Files.readString(Path.of("file-io-app2/src/test.txt")));
            }
    }
