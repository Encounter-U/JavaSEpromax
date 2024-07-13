package com.Encounter.d0_demo.DataStructure;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/20 17:58
 */
public class Stack implements DataStructure
    {
        private ArrayList list=new ArrayList<>();
        @Override
        public void push(Object element)
            {
                list.add(element);
            }

        @Override
        public Object pop(int index)
            {
                return list.get(index);
            }
    }
