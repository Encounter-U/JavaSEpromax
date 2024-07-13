package com.Encounter.d0_demo.libraryManagementSystem;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/20 21:38
 */
public class Book implements Cloneable
    {
        private String title;
        private String author;
        private String publisher;
        private double price;

        public Book()
            {
            }

        public Book(String title, String author, String publisher, double price)
            {
                this.title = title;
                this.author = author;
                this.publisher = publisher;
                this.price = price;
            }

        public String getTitle()
            {
                return title;
            }

        public void setTitle(String title)
            {
                this.title = title;
            }

        public String getAuthor()
            {
                return author;
            }

        public void setAuthor(String author)
            {
                this.author = author;
            }

        public String getPublisher()
            {
                return publisher;
            }

        public void setPublisher(String publisher)
            {
                this.publisher = publisher;
            }

        public double getPrice()
            {
                return price;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }

        @Override
        public String toString()
            {
                return "Book{" +
                        "title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", publisher='" + publisher + '\'' +
                        ", price=" + price +
                        '}';
            }

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Book book = (Book) o;
                return Objects.equals(title, book.title) && Objects.equals(author, book.author);
            }

        @Override
        protected Object clone() throws CloneNotSupportedException
            {
                return super.clone();
            }
    }
