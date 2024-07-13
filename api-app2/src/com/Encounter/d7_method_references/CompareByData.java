package com.Encounter.d7_method_references;

import com.Encounter.d5_arrays.Student;

/**
 * @author Encounter
 * @date 2024/6/22 11:28
 */
public class CompareByData
    {
        public static int compareByAge(Student o1,Student o2)
            {//升序
                return o1.getAge()- o2.getAge();
            }

        public int compareByAgeDesc(Student o1,Student o2)
            {//降序
                return o2.getAge()- o1.getAge();
            }
    }
