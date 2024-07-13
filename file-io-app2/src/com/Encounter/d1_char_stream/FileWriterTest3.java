package com.Encounter.d1_char_stream;

import java.io.FileWriter;
import java.io.Writer;

/**
 * @author Encounter
 * @date 2024/7/3 15:33<p/>
 * 搞清楚字符输出流使用时的注意事项
 */
public class FileWriterTest3
    {
        public static void main(String[] args) throws Exception
            {
                Writer fw = new FileWriter("file-io-app2/src/test3.txt");

                //写字符数据出去
                fw.write('a');
                fw.write('b');
                fw.write('c');
                fw.write('d');
                fw.write("\r\n");

                fw.write("路明非");
                fw.write("\r\n");
                fw.write("路明非");

                fw.flush();//刷新流
                fw.write("楚子航");
                fw.flush();

                fw.close();//关闭流，关闭流包含刷新操作
//                fw.write("陈墨瞳");
            }
    }
