package com.Encounter.d0_demo.test5_4.bookManagement;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/27 8:37
 */
public class Operator
    {
        Set<Book> books = new HashSet<>();

        //添加
        public void addBook(Book... books)
            {
                boolean flag = Collections.addAll(this.books, books);
                if (flag)
                    System.out.println("添加成功");
                else
                    System.out.println("添加失败");
            }

        //移除
        public void deleteBook(String name)
            {
                for (Book book : books)
                    {
                        if (book.getName().equals(name))
                            {
                                books.remove(book);
                                System.out.println(name + "删除成功");
                                return;
                            }
                    }
                System.out.println("删除失败");
            }

        //展示图书及数量
        public void showInfo()
            {
                System.out.println("全部图书信息：");
                System.out.println("=========================");
                for (Book book : books)
                    {
                        System.out.println("书名：《" + book.getName()+"》");
                        System.out.println("=========================");
                    }
                System.out.println("全部书籍数量：" + books.size());
            }
    }
