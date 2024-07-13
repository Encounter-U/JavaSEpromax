package com.Encounter.d0_demo.afterClassExercises.test2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Encounter
 * @date 2024/6/22 16:36
 */
public class Test
    {
        public static void main(String[] args)
            {
                Integer[] arr = {2, 4, 6, 1, 9, 3, 0, 7};
                Arrays.sort(arr, Comparator.reverseOrder());
                System.out.println(Arrays.toString(arr));
            }
    }
