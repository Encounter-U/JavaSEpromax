package com.Encounter.d5_resource;

/**
 * @author Encounter
 * @date 2024/7/3 12:31
 */

/**
 * 认识try-catch-finally
 */
public class Test1
    {
        public static void main(String[] args)
            {
                try
                    {
                        System.out.println(10 / 2);
                        //System.out.println(10 / 0);
                        //return;//跳出方法执行
                        //System.exit(0);//虚拟机
                    }
                catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                finally
                    {
                        //即便有return语句这里也要执行，除非虚拟机挂了
                        System.out.println("finally执行了一次");
                    }
                System.out.println("finally执行了吗");
                System.out.println(division(10, 2));
            }

        public static int division(int a,int b)
            {
                try
                    {
                        return a/b;
                    }
                    catch (Exception e)
                        {
                            e.printStackTrace();
                            return -1;//代表出现异常
                        }
                finally
                    {
                        //切记不能在finally中返回数据
                        //return 100;
                    }
            }
    }
