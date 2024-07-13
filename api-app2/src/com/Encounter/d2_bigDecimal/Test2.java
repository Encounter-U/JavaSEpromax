package com.Encounter.d2_bigDecimal;

/**
 * @author Encounter
 * @date 2024/6/21 11:17
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 掌握BigDecimal进行精确运算的方案<br/>
 * 1.把浮点型数据封装成BigDecimal对象，再来参与运算<br/>
 * a.public BigDecimal(double val) 得到的BigDecimal对象是无法精确计算浮点型数据的。注意：不推荐使用这个<br/>
 * b.public BigDecimal(String val) 得到的BigDecimal对象是可以精确计算浮点型数据的。可以使用<br/>
 * c.public static BigDecimal valueOf(double val) 通过这个静态方法得到的BigDecimal对象是可以精确运算的，是最好的方案<br/>
 * 2.public BigDecimal add(BigDecimal augend):加法<br/>
 * 3.public BigDecimal subtract(BigDecimal augend):减法<br/>
 * 4.public BigDecimal multiply(BigDecimal augend):乘法<br/>
 * 5.public BigDecimal divide(BigDecimal augend):除法<br/>
 * 6.public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式):除法，可以设置精确几位<br/>
 * 7.public double doubleValue() : 把BigDecimal对象又转换成Double类型的数据
 */
public class Test2
    {
        public static void main(String[] args)
            {
                double a = 0.1;
                double b = 0.2;

                //1.
                //a.
                /*BigDecimal a1=new BigDecimal(a);
                BigDecimal b1=new BigDecimal(b);*/
                //b.
                /*BigDecimal a1 = new BigDecimal(Double.toString(a));
                BigDecimal b1 = new BigDecimal(Double.toString(b));*/
                //c.
                BigDecimal a1 = BigDecimal.valueOf(a);
                BigDecimal b1 = BigDecimal.valueOf(b);

                //2.
                BigDecimal c1 = a1.add(b1);
                System.out.println(c1);

                //3.
                BigDecimal c2 = a1.subtract(b1);
                System.out.println(c2);

                //4.
                BigDecimal c3 = a1.multiply(b1);
                System.out.println(c3);

                //5.
                BigDecimal c4 = a1.divide(b1);
                System.out.println(c4);

                //6.
                BigDecimal d1 = BigDecimal.valueOf(0.1);
                BigDecimal d2 = BigDecimal.valueOf(0.3);
                BigDecimal d3 = d1.divide(d2, 2, RoundingMode.HALF_UP);
                System.out.println(d3);

                //7.
                print(d3.doubleValue());
                print(c1.doubleValue());
            }

        public static void print(double a)
            {

            }
    }
