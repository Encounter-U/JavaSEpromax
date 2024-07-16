package com.Encounter.d2_xml;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author Encounter
 * @date 2024/7/13 18:25<p/>
 * <?xml version="1.0" encoding="UTF-8" ?>
 * <book>
 * <name>龙族</name>
 * <author>江南</author>
 * <price>28.8</price>
 * </book>
 */
public class Dom4jTest2
    {
        public static void main(String[] args)
            {
                //1.使用一个StringBuilder对象来拼接XML格式的数据
                StringBuilder sb=new StringBuilder();
                sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
                sb.append("<book>\r\n");
                sb.append("\t<name>").append("龙族").append("</name>\r\n");
                sb.append("\t<author>").append("江南").append("</author>\r\n");
                sb.append("\t<price>").append("28.8").append("</price>\r\n");
                sb.append("</book>\r\n");

                try (BufferedWriter bw = new BufferedWriter(
                        new FileWriter("properties-xml-log-app/src/com/Encounter/d2_xml/book.xml")))
                    {
                        bw.write(sb.toString());
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
