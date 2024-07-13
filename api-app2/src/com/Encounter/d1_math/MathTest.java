package com.Encounter.d1_math;
/**
 * @author Encounter
 * @date 2024/6/21 10:34
 */

/**
 * 了解下Math类提供的常见方法<br/>
 * 1.public static int abs(int a)：取绝对值（拿到的结果一定是正数）<br/>
 * public static double abs(double a)<br/>
 * 2.public static double ceil(double a)：向上取整<br/>
 * 3.public static double floor(double a)：向下取整<br/>
 * 4.public static long round(double a)：四舍五入<br/>
 * 5.public static int max(int a,int b)：取较大值<br/>
 * public static int min(int a,int b)：取较小值<br/>
 * 6.public static double pow(double a,double b)：取次方<br/>
 * 7.public static double random()：取随机数[0.0,1.0)（包前不包后）
 */
public class MathTest
    {
        public static void main(String[] args)
            {
                //1.
                System.out.println(Math.abs(-12));
                System.out.println(Math.abs(123));
                System.out.println(Math.abs(-3.14));

                //2.
                System.out.println(Math.ceil(4.0000000001));
                System.out.println(Math.ceil(4.0));

                //3.
                System.out.println(Math.floor(4.99999999999));
                System.out.println(Math.floor(4.0));

                //4.
                System.out.println(Math.round(4.4999999999));
                System.out.println(Math.round(4.5000000001));

                //5.
                System.out.println(Math.max(10, 20));
                System.out.println(Math.min(10, 20));

                //6.
                System.out.println(Math.pow(2, 3));//2的3次方

                //7.
                System.out.println(Math.random());
            }
    }
