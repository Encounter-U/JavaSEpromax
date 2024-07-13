package com.Encounter.d0_demo.hotel;

/**
 * @author Encounter
 * @date 2024/6/19 17:09
 */

/**
 * 现有一个5星级酒店，按照要求完成代码:
 * ①定义抽象类员工(Employee)，具有姓名name，工号id等属性
 * ②接囗Service，实现这一接口表示具有vip服务
 * ③再定义厨师Cooker类,服务员Waiter类,经理Manager类，三个员工都有姓名name，工号id的属性,只有厨师和服务员有vip服务,厨师vip服务加
 * 菜,服务员嘘寒问暖
 * ④)定义程序实现功能并测试
 */
public class Test
    {
        public static void main(String[] args)
            {
                Cooker cooker = new Cooker("路明非", 10);
                cooker.ordinaryService();
                Waiter waiter = new Waiter("楚子航", 12);
                waiter.ordinaryService();
                Manager manager = new Manager("凯撒", 18);
                manager.ordinaryService();
            }
    }
