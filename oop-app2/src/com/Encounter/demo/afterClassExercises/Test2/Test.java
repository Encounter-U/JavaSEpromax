package com.Encounter.demo.afterClassExercises.Test2;

/**
 * @author Encounter
 * @date 2024/6/19 15:47
 */

/**
 * 1.定义USB接口:(开启功能)
 * (关闭功能)
 * 2.定义笔记本类:(开机功能)
 * (关机功能)
 * 3.定义鼠标类:要符合USB接囗
 * 4.定义测试类:创建电脑对象,依次调用开机方法,使用USB设备,关机方法
 * 运行结果:
 * 开机
 * 连接鼠标的USB
 * 断开鼠标的USB
 * 关机
 * 【训练目标】:
 * 能够独立定义接口
 * 【思路分析】:
 * 笔记本类中使用USB设备的功能
 * 【参考方案】
 * 【参考步骤】:
 * .按照题目要求，定义USB接口、鼠标类、笔记本类，笔记本类中定义的使用usb设备方法，形参接受接口类型
 * 2.定义测试类，创建笔记本类对象，根据案例运行结果调用内部方法。
 */
public class Test
    {
        public static void main(String[] args)
            {
                Computer computer = new Computer();
                computer.begin();
                computer.end();
            }
    }
