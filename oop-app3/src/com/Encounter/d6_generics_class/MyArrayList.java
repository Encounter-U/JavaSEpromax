package com.Encounter.d6_generics_class;

/**
 * @author Encounter
 * @date 2024/6/20 16:21
 */
public class MyArrayList<E>
    {
        private Object[] arr = new Object[10];
        private int size;

        public boolean add(E e)
            {
                arr[size++] = e;
                return true;
            }

        public E get(int index)
            {
                return (E) arr[index];
            }
    }
