package com.Encounter.d2_collection_traverse;

/**
 * @author Encounter
 * @date 2024/6/24 14:44
 */

import java.util.ArrayList;
import java.util.Collection;

/**
 * 完成电影信息的展示
 */
public class CollectionTest4
    {
        public static void main(String[] args)
            {
                Collection<Movie> movies=new ArrayList<>();
                movies.add(new Movie("龙族",10.0,"路明非"));
                movies.add(new Movie("变形金刚",9.8,"optimusPrime"));
                movies.add(new Movie("肖申克的救赎",9.7,"罗宾斯"));
                System.out.println(movies);

                for (Movie movie : movies)
                    {
                        System.out.println(movie.toString());
                    }
            }
    }
