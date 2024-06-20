package com.Encounter.d0_demo.alarm;

/**
 * @author Encounter
 * @date 2024/6/19 19:51
 */

/**
 * 某手机需完成闹钟功能(通过匿名内部类方式)
 * 需要如下:
 * ①定义一个铃声接口Bell，里面有个ring方法。
 * ②)定义一个手机类Celphone，具有闹钟功能alarmClock，参数是Bell类型
 * ③定义一个测试类，来测试手机类的闹钟功能，通过匿名内部类(对象)作为参数，打印:懒猪起床了
 * 4)再在测试类中通过匿名内部类(对象)作为参数，打印:小伙伴上课了
 */
public class Test
    {
        public static void main(String[] args)
            {
                Bell bell=new Bell(){
                    @Override
                    public void Bell()
                        {
                            System.out.println("小伙伴上课了");
                        }
                };
                Cellphone cellphone =new Cellphone();
                cellphone.alarmClock(bell);
            }
    }
