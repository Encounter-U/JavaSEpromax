package com.Encounter.d0_demo.stageTest2;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/07/20 21:30<br/>
 */
public class Menu
    {
        private static Scanner sc = new Scanner(System.in);
        
        public static String scan()
            {
                System.out.println("1.查询所有商品信息，2.商品入库，3.商品出库，4.查看指定商品库存数量，5.退出系统");
                System.out.print("请输入您的选择：");
                return sc.nextLine();
            }
        
        public static void start(String choice)
            {
                Inventory inv = new Inventory();
                System.out.println("------------欢迎来到库存管理系统----------");
                while (true)
                    {
                        choice = scan();
                        switch (choice)
                            {
                                //查询全部商品信息
                                case "1" -> inv.queryAll();
                                //商品入库
                                case "2" ->
                                    {
                                        Product scanProduct = inv.scanner();
                                        inv.warehousing(scanProduct);
                                    }
                                //商品出库
                                case "3" ->
                                    {
                                        Product scanProduct = inv.scanner();
                                        inv.reduceInventory(scanProduct);
                                    }
                                //根据商品名查询商品详情
                                case "4" ->
                                    {
                                        System.out.print("请输入要查询的商品名：");
                                        inv.queryInventory(sc.nextLine());
                                    }
                                //退出系统
                                case "5" -> inv.exit();
                                default -> System.out.println("您输入的选项有误，请重新输入！");
                            }
                    }
            }
    }
