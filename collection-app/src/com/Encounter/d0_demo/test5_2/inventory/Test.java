package com.Encounter.d0_demo.test5_2.inventory;

/**
 * @author Encounter
 * @date 2024/6/25 15:37
 */

/**
 * 小超市的进货单|nventory类，需要记录每种商品的名称、数量和单价，使用List集合存储这些信息。并编写测试类测试以下功能.
 * ①创建product类属性包含 名称、数量、单价
 * ②)创建Inventory类里面包含方法如下
 * ③添加新的商品到进货单中
 * 4)查找进货单中某种商品的信息，并打印出来
 * ⑤统计进货单中所有商品的数量和总价
 * ⑥打印进货单中所有商品的信息
 * 提示，①要在product类中定义获取单个商品总价的方法，②product的toString方法要打印商品信息和总价
 */
public class Test
    {
        public static void main(String[] args)
            {
                Inventory inventory=new Inventory();
                //添加
                inventory.addProduct(new Product("《龙族》",3,28.5));
                inventory.addProduct(new Product("苹果",20,1.6));
                inventory.addProduct(new Product("香蕉",10,1.3));
                inventory.addProduct(new Product("笔",3,1));
                inventory.addProduct(new Product("工具",10,15));

                //查询
                inventory.selectByName("《龙族》");
                inventory.selectByName("龙族");

                //总量和总价
                inventory.sum();

                //打印所有
                inventory.showAll();
            }
    }
