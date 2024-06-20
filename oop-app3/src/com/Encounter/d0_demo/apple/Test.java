package com.Encounter.d0_demo.apple;

/**
 * @author Encounter
 * @date 2024/6/19 20:04
 */
public class Test
    {
        public static void main(String[] args)
            {
                Apple a1=new Apple(5,"青色");
                Apple a2=new Apple(3,"红色");
                Worker worker=new Worker();
                worker.pickApple(new CompareAble()
                    {
                        @Override
                        public Apple compare(Apple a1, Apple a2)
                            {
                                if (a1.getSize() > a2.getSize())
                                    return a1;
                                return a2;
                            }
                    }, a1, a2);
            }
    }
