package com.Encounter.d0_demo.libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/20 21:39
 */
public class Library
    {
        private List<Book> books = new ArrayList<>();

        public Library(List<Book> books)
            {
                this.books = books;
            }

        public Library()
            {
            }

        public List<Book> getBooks()
            {
                return books;
            }

        public void setBooks(ArrayList<Book> books)
            {
                this.books = books;
            }

        //添加到书架
        void addBook(Book book)
            {
                books.add(book);
            }

        //移除出书架
        void removeBook(Book book)
            {
                books.remove(book);
            }


        //根据关键词查找书籍
        List search(String keyword)
            {
                List<Book> books = new ArrayList<>();
                //先找书名
                for (int i = 0; i < this.books.size(); i++)
                    {
                        Book book = this.books.get(i);
                        if (book.getTitle().contains(keyword))
                            {//找书名
                                if (exist(books, book))
                                    books.add(book);
                            }
                        if (book.getAuthor().contains(keyword))
                            {//找作者
                                if (exist(books, book))
                                    books.add(book);
                            }
                        if (book.getPublisher().contains(keyword))
                            {//找出版社
                                if (exist(books, book))
                                    books.add(book);
                            }
                    }
                //找作者
                return books;
            }

        //判断集合中是否已存在该元素
        boolean exist(List<Book> books, Book book)
            {
                for (int i = 0; i < books.size(); i++)
                    {
                        if (Objects.equals(books.get(i), book))
                            return false;//存在
                    }
                return true;//不存在
            }
    }
