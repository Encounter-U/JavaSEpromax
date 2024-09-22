package com.Encounter.d0_demo.stageTest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/07/20 19:58<br/>
 */
public class Inventory
    {
        private List<Product> products;
        private Scanner sc = new Scanner(System.in);
        private String filePath = "D:\\Study_Document\\BoXueGu\\JavaSEpromax\\junit-reflect-annotation-proxy-app\\src\\com\\Encounter\\d0_demo\\stageTest2\\库存文件.txt";
        
        public Inventory()
            {
                products = new ArrayList<>();
                //解析文件并存入集合
                try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
                    {
                        String line;
                        while ((line = br.readLine()) != null)
                            {
                                String[] split = line.split(",");
                                String productName = split[0];
                                double price = Double.parseDouble(split[1]);
                                int quantity = Integer.parseInt(split[2]);
                                products.add(new Product(productName, price, quantity));
                            }
                        System.out.println("------------库存初始化完成----------");
                        //System.out.println(products);
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
        
        /**
         * 遍历集合，更新库存文件
         */
        private void updateFile()
            {
                try (PrintStream ps = new PrintStream(filePath))
                    {
                        //遍历集合，更新库存文件
                        for (Product product : products)
                            ps.println(product.getName() + "," + product.getPrice() + "," + product.getQuantity());
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
        
        /**
         * 键盘录入商品信息，并初步判断输入信息是否正确并返回一个商品对象
         */
        public Product scanner()
            {
                //键盘录入正确的数据
                System.out.println("------------请依次输入商品名称,价格,数量（用英文逗号隔开）----------");
                String info = sc.nextLine();
                String[] split = info.split(",");
                if (split.length != 3)
                    {
                        System.out.println("您输入的信息有误，请重新输入！");
                        return null;
                    }
                String name = split[0];
                double price = 0;
                int quantity = 0;
                //初步判断价格是否正确
                try
                    {
                        price = Double.parseDouble(split[1]);
                        if (price <= 0)
                            System.out.println("请输入正确的价格！");
                    }
                catch (Exception e)
                    {
                        System.out.println("请输入正确的价格！");
                    }
                
                //初步判断数量是否正确
                try
                    {
                        quantity = Integer.parseInt(split[2]);
                        if (quantity < 0)
                            System.out.println("请输入正确的数量！");
                        
                    }
                catch (Exception e)
                    {
                        System.out.println("请输入正确的数量！");
                    }
                if (price != 0 && quantity != 0)
                    return new Product(name, price, quantity);
                else
                    return null;
            }
        
        /**
         * 入库
         */
        public void warehousing(Product scanProduct)
            {
                //键盘录入商品信息
                //Product scanProduct = scanner();
                //非空验证
                if (scanProduct == null)
                    return;
                //加入商品
                //定义标志，默认不存在商品
                boolean flag = false;
                for (Product product : products)
                    {
                        //库中存在该商品，直接增加库存数量
                        if (product.getName().equals(scanProduct.getName()) && product.getPrice() == scanProduct.getPrice())
                            {
                                product.addQuantity(scanProduct.getQuantity());
                                flag = true;//商品存在
                            }
                    }
                if (!flag)
                    //库存中没有与之商品名及价格相同的，直接新增商品
                    products.add(scanProduct);
                //更新库存文件
                updateFile();
            }
        
        /**
         * 减少库存
         */
        public void reduceInventory(Product scanProduct)
            {
                //键盘录入商品信息
                //Product scanProduct = scanner();
                //键盘录入非空验证
                if (scanProduct == null)
                    return;
                String name = scanProduct.getName();
                double price = scanProduct.getPrice();
                int quantity = scanProduct.getQuantity();
                //遍历集合，更新数据
                //定义标志，默认不存在商品
                boolean flag = false;
                for (Product product : products)
                    {
                        if (product.getName().equals(name) && product.getPrice() == price && product.getQuantity() > quantity)
                            {
                                product.reduceQuantity(quantity);
                                flag = true;
                            }
                        else if (product.getName().equals(name) && product.getPrice() == price && product.getQuantity() < quantity)
                            {
                                System.out.println("您要减少的库存数目过大，库存数目不足");
                                flag = true;
                            }
                        else if (product.getName().equals(name) && product.getPrice() == price && product.getQuantity() == quantity)
                            {
                                products.remove(product);
                                System.out.println("已成功删除该商品信息");
                                flag = true;
                            }
                    }
                if (!flag)
                    throw new RuntimeException("库存中暂时没有您要操作的商品，请检查您输入的信息是否有误！");
                //更新文件
                updateFile();
            }
        
        /**
         * 根据名称查询库存
         */
        public void queryInventory(String name)
            {
                //System.out.printf("请输入要查询的商品名：");
                //String name = sc.nextLine();
                StringBuilder sb = new StringBuilder();
                
                try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
                    {
                        //逐行解析库存文件
                        String line;
                        while ((line = br.readLine()) != null)
                            {
                                String[] split = line.split(",");
                                //将符合条件的商品信息拼接起来
                                if (split[0].equals(name))
                                    {
                                        sb.append("商品名称：").append(split[0]).append("\t\n");
                                        sb.append("价格：").append(split[1]).append("\t\n");
                                        sb.append("库存数量：").append(split[2]).append("\t\n");
                                        sb.append("============").append("\t\n");
                                    }
                            }
                        //输出符合条件的库存文件
                        if (!(sb.compareTo(new StringBuilder()) == 0))
                            System.out.println(sb);
                        else
                            System.out.println("您要查找的商品不存在！");
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
        
        /**
         * 查询全部商品
         */
        public void queryAll()
            {
                if (products.isEmpty())
                    {
                        System.out.println("仓库为空，赶快添加内容吧~");
                        return;
                    }
                for (Product product : products)
                    {
                        System.out.println("商品名称：" + product.getName());
                        System.out.println("价格：" + product.getPrice());
                        System.out.println("库存数量：" + product.getQuantity());
                        System.out.println("============");
                    }
            }
        
        /**
         * 退出系统
         */
        public void exit()
            {
                //先将库存文件更新
                updateFile();
                //提示退出
                System.out.println("正在保存文件到库存文件.txt中...");
                System.out.println("bye bye ~");
                //关闭虚拟机
                System.exit(0);
            }
        
    }
