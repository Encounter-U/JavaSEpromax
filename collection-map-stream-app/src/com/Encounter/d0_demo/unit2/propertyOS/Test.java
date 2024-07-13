package com.Encounter.d0_demo.unit2.propertyOS;

/**
 * @author Encounter
 * @date 2024/6/29 16:04
 */

/**
 * 假设有一个小区物业管理系统，需要管理每个住户的信息，包括住户的姓名、电话、门牌号和欠费金额。现在要实现以下功能:
 * ①使用LinkedList集合存储住户信息，每个住户信息用一个自定义类Resident表示，类包含姓名、电话、门牌号、欠费金额，重写toString方法
 * ②定义PropertyManagementSystem类实现以下方法,使用Scanner类从控制台输入住户信息，格式如下:请输入住户信息(格式:姓名 电话 门牌
 * 号 欠费金额)，输入0结束:
 * ③使用List的add()方法将住户信息添加到LinkedList集合中。
 * 4)使用List的forEach()方法遍历LinkedList集合，查找指定门牌号的住户信息并打印出来
 * ⑤)使用List的forEach(方法遍历LinkedList集合，统计所有住户的欠费金额和总人数，并打印出来。
 * ⑥使用List的forEach()方法遍历LinkedList集合，打印所有住户的信息，并按照门牌号从小到大排序,
 */
public class Test
    {
        public static void main(String[] args)
            {
                PropertyManagementSystem pms=new PropertyManagementSystem();
                pms.start();//开始
            }
    }
