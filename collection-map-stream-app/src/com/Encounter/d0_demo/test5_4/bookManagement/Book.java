package com.Encounter.d0_demo.test5_4.bookManagement;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/27 8:36
 */
public class Book
    {
        private String name;

        public Book(String name)
            {
                this.name = name;
            }

        public Book()
            {
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Book book = (Book) o;
                return Objects.equals(name, book.name);
            }

        @Override
        public int hashCode()
            {
                return Objects.hash(name);
            }
    }
