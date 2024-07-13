package com.Encounter.d0_demo.myMap;

/**
 * @author Encounter
 * @date 2024/6/20 17:51
 */
public class MyMap<K, V>
    {
        private K first;
        private V second;

        public MyMap(K first, V second)
            {
                this.first = first;
                this.second = second;
            }

        public MyMap()
            {
            }

        public K getFirst()
            {
                return first;
            }

        public void setFirst(K first)
            {
                this.first = first;
            }

        public V getSecond()
            {
                return second;
            }

        public void setSecond(V second)
            {
                this.second = second;
            }
    }
