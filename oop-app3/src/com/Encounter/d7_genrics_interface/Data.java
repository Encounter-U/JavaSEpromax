package com.Encounter.d7_genrics_interface;

import java.util.ArrayList;

public interface Data<T>
    {
        void add(T t);
        ArrayList<T> getName(String name);
    }
