package com.Encounter.d2_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author Encounter
 * @date 2024/7/13 17:20<p/>
 * 目标：掌握使用Dom4j框架解析XML文件
 */
public class Dom4jTest1
    {
        public static void main(String[] args) throws Exception
            {
                //1.创建一个Dom4j框架提供的解析器对象
                SAXReader saxReader = new SAXReader();

                //2.使用saxReader对象把需要解析的XML文件读成一个Document对象
                Document document = saxReader.read("properties-xml-log-app/src/helloworld.xml");

                //3.从文档对象中解析XML文件的全部数据
                Element root = document.getRootElement();
                System.out.println(root.getName());

                //4.获取根元素下的全部一级子元素
                //List<Element> elements = root.elements();
                List<Element> elements = root.elements("user");
                for (Element element : elements)
                    {
                        System.out.println(element.getName());
                    }

                //5.获取当前元素下的某个子元素
                Element people = root.element("people");
                System.out.println(people.getText());

                //若下面有很多子元素，默认获取第一个
                Element user = root.element("user");
                System.out.println(user.elementText("name"));
                System.out.println(user.elementText("sex"));

                //6.如何获取元素的属性信息
                System.out.println(user.attributeValue("id"));
                Attribute id = user.attribute("id");
                System.out.println(id.getName());
                System.out.println(id.getValue());
            }
    }
