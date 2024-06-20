package com.Encounter.d14_extends_constructor;

/**
 * @author Encounter
 * @date 2024/6/18 13:22
 */

/**
 * 先认识子类构造器的特点，在掌握这个特点的常见应用场景
 */

class F{
    /*public F()
        {
            System.out.println("父类F的无参构造器执行了");
        }*/
    public F(String name,int age){

    }
}

class Z extends F{
    public  Z()
    {
        //super();//默认存在，不必写
        super("路明非",22);
        System.out.println("子类Z的无参构造器执行了");
    }
    public  Z(String name)
    {
        //super();//默认存在，不必写
        super("楚子航",23);
        System.out.println("子类Z的有参构造器执行了");
    }
}
public class Test
    {
        public static void main(String[] args)
            {
                Z z=new Z();
                System.out.println("=====================");
                Z z1=new Z("路明非");
            }
    }
