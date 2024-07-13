package com.Encounter.d0_demo.test5_4.bookManagement;

/**
 * @author Encounter
 * @date 2024/6/27 9:37
 */

/**
 * 在线图书商店编写一段代码来管理用户的书单。需要实现以下功能:
 * ①)每个用户可以将一本或多本图书添加到书单中，并将图书信息存储在集合中,。
 * ②实现添加图书到书单的功能，确保同一本图书不会重复添加。
 * ③实现从书单中移除图书的功能，用户可以选择移除已添加的图书。
 * ④)实现展示书单中的图书和统计书单中图书的数量的功能，以便用户可以查看书单内容和数量统计,。
 */
public class Test
    {
        public static void main(String[] args)
            {
                Operator o = new Operator();
                o.addBook(
                        new Book("龙族1"),
                        new Book("龙族1"),
                        new Book("龙族3"),
                        new Book("龙族4")
                );

                o.deleteBook("龙族3");
                o.deleteBook("龙族5");

                o.showInfo();
            }
    }
