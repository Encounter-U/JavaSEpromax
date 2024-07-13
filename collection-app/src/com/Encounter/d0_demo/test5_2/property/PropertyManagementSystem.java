package com.Encounter.d0_demo.test5_2.property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/25 15:54
 */
public class PropertyManagementSystem
    {
        private List<Resident> residents = new ArrayList<>();
        private Scanner sc = new Scanner(System.in);

        //主页菜单
        public void menu()
            {
                System.out.println("=================================");
                while (true)
                    {
                        System.out.println("1.添加用户信息");
                        System.out.println("2.根据门牌号查询住户信息");
                        System.out.println("3.统计所有欠费金额及总人数");
                        System.out.println("4.展示所有住户信息并按门牌号从大到小排序");
                        System.out.println("0.退出系统");
                        System.out.println("=================================");
                        System.out.print("请输入您的选择：");
                        String choice = sc.next();
                        switch (choice)
                            {
                                case "1" -> addResident();
                                case "2" -> selectByNum();
                                case "3" -> sum();
                                case "4" -> showAll();
                                case "0" -> System.exit(0);
                                default -> System.out.println("您输入的选项有误");
                            }
                    }
            }

        //添加用户
        private void addResident()
            {
                System.out.print("输入住户姓名：");
                String name = sc.next();
                while (true)
                    {
                        System.out.print("输入住户电话：");
                        String phone = sc.next();
                        if (phone.matches("1[3-9]\\d{9}"))
                            {
                                while (true)
                                    {
                                        try
                                            {
                                                Scanner sc1 = new Scanner(System.in);
                                                System.out.print("输入住户门牌号：");
                                                int number = sc1.nextInt();
                                                while (true)
                                                    {
                                                        try
                                                            {
                                                                Scanner sc2 = new Scanner(System.in);
                                                                System.out.print("输入欠费金额（输入0退出）：");
                                                                double money = sc2.nextDouble();
                                                                if (money <= 0)
                                                                    return;
                                                                residents.add(new Resident(name, phone, number, money));
                                                                System.out.println("姓名为" + name + "的住户信息已添加成功");
                                                                System.out.println("=================================");
                                                                return;
                                                            }
                                                        catch (Exception e)
                                                            {
                                                                System.out.println("请输入正确的欠费金额");
                                                            }
                                                    }
                                            }
                                        catch (Exception e)
                                            {
                                                System.out.println("请输入正确的门牌号");
                                            }
                                    }
                            }
                        else
                            System.out.println("请输入正确的手机号！");
                    }
            }

        //根据门牌号查询
        private void selectByNum()
            {
                //判断是否有住户信息
                if (exist())
                    return;
                try
                    {
                        Scanner sc3 = new Scanner(System.in);
                        System.out.print("请输入要查询的住户门牌号：");
                        int num = sc3.nextInt();
                        for (Resident resident : residents)
                            {
                                if (num == resident.getNumber())
                                    {
                                        System.out.println("您要查找的信息如下：");
                                        System.out.println(resident);
                                        System.out.println("=================================");
                                        //结束方法
                                        return;
                                    }
                            }
                        System.out.println("暂无该用户信息");
                        System.out.println("=================================");
                    }
                catch (Exception e)
                    {
                        System.out.println("您输入的门牌号有误");
                        System.out.println("=================================");
                    }
            }

        //统计所有住户的欠费金额和总人数
        private void sum()
            {
                //判断是否有住户信息
                if (exist())
                    return;
                double totalMoney = 0;
                for (Resident resident : residents)
                    {
                        totalMoney += resident.getMoney();
                    }
                System.out.println("欠费总金额为：" + totalMoney);
                System.out.println("欠费总人数为：" + residents.size());
                System.out.println("=================================");
            }

        //打印所有住户信息
        private void showAll()
            {
                //判断是否有住户信息
                if (exist())
                    return;
                List<Resident> res = rankByNum(residents);
                System.out.println("全部住户信息如下：");
                System.out.println("=================================");
                for (Resident resident : res)
                    {
                        System.out.println("姓名：" + resident.getName());
                        System.out.println("电话：" + resident.getPhone());
                        System.out.println("门牌号：" + resident.getNumber());
                        System.out.println("欠费金额：" + resident.getMoney());
                        System.out.println("=================================");
                    }
            }

        //按照门牌号从大到小排序
        private List<Resident> rankByNum(List<Resident> r)
            {
                Resident[] residentsArray = r.toArray(new Resident[r.size()]);
                Arrays.sort(residentsArray, (o1, o2) -> o2.getNumber() - o1.getNumber());
                for (int i = 0; i < r.size(); i++)
                    {
                        r.set(i, residentsArray[i]);
                    }
                return r;
            }

        //判断有无用户信息
        private boolean exist()
            {
                if (residents.size() <= 0)
                    {
                        System.out.println("暂无住户信息，请先添加住户");
                        System.out.println("=================================");
                        return true;
                    }
                return false;
            }
    }
