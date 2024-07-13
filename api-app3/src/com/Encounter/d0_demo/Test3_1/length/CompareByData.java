package com.Encounter.d0_demo.Test3_1.length;

/**
 * @author Encounter
 * @date 2024/6/22 16:44
 */
public class CompareByData
    {
        public static int compareByLength(String o1,String o2)
            {
                if (o1.length() > o2.length())
                    return 1;
                else if (o1.length() < o2.length())
                    return -1;
                return 0;
            }
    }
