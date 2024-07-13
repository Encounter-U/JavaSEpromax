package com.Encounter.d0_demo.libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/20 22:01
 */

/**
 * 实现一个简单的图书管理系统，其中涉及以下两个类:
 * Book类，表示一本书，包含书名(title)、作者(author)、出版社(publisher)和价格(price)等属性;
 * Library类，表示一个图书馆，包含多本书(Book对象)
 * 请完成以下任务:
 * ①在Book类中重写equals方法，判断两本书是否相同时，只需要比较它们的书名和作者,
 * ②)在Book类中重写toString方法，使得打印出一个Book对象时，输出该书的书名、作者、出版社和价格等信息
 * ③在Book类中实现Cloneable接口，并重写clone方法，使得可以复制一本Book对象;
 * ④在Library类中实现以下方法:
 * void addBook(Book book):向图书馆中添加一本书
 * void removeBook(Book book):从图书馆中移除一本书,
 * List searchBook(String keyword):根据关键词在图书馆中搜索书籍，返回符合条件的所有书籍的列表。
 * ⑤在测试类中，新建一个 Library对象，并向Library中添加三本书籍。然后测试查找、测试删除、测试克隆
 * 提示:可以使用List集合存储图书馆中的所有书籍。
 */
public class Test
    {
        public static void main(String[] args) throws CloneNotSupportedException
            {
                Book b1 = new Book("Java从入门到精通", "明日科技", "清华大学出版社", 79.80);
                Book b2 = new Book("JavaWeb从入门到精通", "明日科技", "清华大学出版社", 99.80);
                Book b3 = new Book("龙族", "江南Web", "人民文学出版社", 24.80);
                List<Book> books = new ArrayList<>();
                Library library = new Library(books);
                System.out.println("添加并查找书籍：");
                library.addBook(b1);
                library.addBook(b2);
                library.addBook(b3);
                System.out.println(library.getBooks() + "\n");

                System.out.println("测试查找：");
                System.out.println(library.search("Java"));
                System.out.println(library.search("Web") + "\n");

                System.out.println("测试删除：");
                library.removeBook(b3);
                System.out.println(library.getBooks() + "\n");

                System.out.println("测试克隆：");
                Book b4 = (Book) b2.clone();
                System.out.println("b4与b2比较：" + Objects.equals(b2, b4) + "\n");

                System.out.println("测试重写的toString：");
                System.out.println(b1.toString() + "\n");

                System.out.println("测试重写的equals：");
                Book b5 = new Book("龙族", "江南", "人民文学出版社", 24.80);
                Book b6 = new Book("龙族", "江南", "出版社", 2.80);
                System.out.println("b5与b6比较：" + b5.equals(b6));
            }
    }
