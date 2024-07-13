package com.Encounter.d0_demo.unit2.propertyOS;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/29 15:04
 */
public class PropertyManagementSystem
    {
        private List<Resident> residents = new LinkedList<>();
        private Scanner sc = new Scanner(System.in);

        //开始
        public void start()
            {
                System.out.println("===============欢迎来到物业管理系统===============");
                while (true)
                    {
                        System.out.println("1.存储住户欠费信息");
                        System.out.println("2.根据门牌号查找住户信息");
                        System.out.println("3.统计所有住户的欠费金额及总人数");
                        System.out.println("4.查询所有住户信息(按照门牌号从大到小排序)");
                        System.out.println("5.退出系统");
                        System.out.println("==============================================");
                        System.out.print("请输入您的选择：");
                        String choice = sc.nextLine();
                        switch (choice)
                            {
                                case "1" -> addResident();
                                case "2" -> showByNum();
                                case "3" -> sum();
                                case "4" -> rankByNum();
                                case "5" -> System.exit(0);
                                default ->
                                    {
                                        System.out.println("您输入的选项有误，请重新输入");
                                        System.out.println("==============================================");
                                    }
                            }
                    }
            }

        private void addResident()
            {
                System.out.println("请输入住户信息：（格式：姓名 电话 门牌号 欠费金额，以空格隔开，输入0结束）");
                String info = sc.nextLine();
                //输入0退出录入信息
                if (info.equals("0"))
                    {
                        System.out.println("信息录入已退出");
                        System.out.println("==============================================");
                        return;
                    }
                String[] infos = info.split("\\s+");
                String name = infos[0];//住户名
                String phone = infos[1];//手机号
                if (!phone.matches("1[3-9]\\d{9}"))
                    {
                        System.out.println("您输入的号码有误，请重新输入！");
                        System.out.println("==============================================");
                        return;//退出
                    }
                String num = infos[2];//门牌号
                int doorNum;
                if (!num.matches("\\d{4}"))
                    {
                        System.out.println("您输入的门牌号有误，门牌号由4位纯数字组成");
                        System.out.println("==============================================");
                        return;//退出
                    }
                else
                    {
                        doorNum = Integer.parseInt(num);
                    }
                if (exist(residents, doorNum) != null)
                    {
                        System.out.println("该住户已存在，请重新输入！");
                        System.out.println("==============================================");
                        return;//退出
                    }
                String amountStr = infos[3];//欠费金额
                double amount = 0;
                if (!amountStr.matches("[1-9]\\d*.\\d*|0\\.\\d*[1-9]\\d*"))
                    {
                        System.out.println("请输入正确的金额，需大于0");
                        System.out.println("==============================================");
                        return;//退出
                    }
                else
                    {
                        amount = Double.parseDouble(amountStr);
                    }
                //信息全部合法，存入信息
                residents.add(new Resident(name, phone, doorNum, amount));
                System.out.println("姓名为" + name + "的住户信息已添加成功");
                System.out.println("==============================================");
            }

        //根据门牌号打印住户信息
        private void showByNum()
            {
                if (residents.isEmpty())
                    {
                        System.out.println("暂无住户信息，无法查询，请先添加住户信息");
                        System.out.println("==============================================");
                        return;
                    }
                System.out.print("请输入要查询的门牌号：");
                String num = sc.nextLine();
                int doorNum;
                if (!num.matches("\\d{4}"))
                    {
                        System.out.println("您输入的门牌号有误，门牌号由4位纯数字组成");
                        System.out.println("==============================================");
                        return;//退出
                    }
                else
                    {
                        doorNum = Integer.parseInt(num);
                    }
                Resident resident = exist(residents, doorNum);
                if (resident != null)
                    {
                        System.out.println("您要查询的住户信息如下：");
                        System.out.println(resident);
                        System.out.println("==============================================");
                    }
            }

        //统计所有住户的欠费金额及欠费总人数
        private void sum()
            {
                if (residents.isEmpty())
                    {
                        System.out.println("暂无住户信息，无法查询，请先添加住户信息");
                        System.out.println("==============================================");
                        return;
                    }
                double sumAmount = 0;
                for (Resident resident : residents)
                    {
                        sumAmount += resident.getAmount();
                    }
                System.out.println("欠费总金额为：" + sumAmount);
                System.out.println("欠费总人数为：" + residents.size());
                System.out.println("==============================================");
            }

        //打印所有住户信息，并按照门牌号从大到小排序
        public void rankByNum()
            {
                if (residents.isEmpty())
                    {
                        System.out.println("暂无住户信息，无法查询，请先添加住户信息");
                        System.out.println("==============================================");
                        return;
                    }
                //按照门牌号升序排序
                residents.sort(Comparator.comparing(Resident::getNum));
                System.out.println("所有住户信息如下：");
                System.out.println("==============================================");
                for (Resident resident : residents)
                    {
                        System.out.println(resident);
                    }
            }

        //判断门牌号是否存在并返回住户信息
        private Resident exist(List<Resident> residents, int num)
            {
                for (Resident resident : residents)
                    {
                        if (num == resident.getNum())
                            return resident;//存在返回住户信息
                    }
                return null;//不存在返回空
            }
    }
