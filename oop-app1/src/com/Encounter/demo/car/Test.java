package com.Encounter.demo.car;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/17 22:36
 */

/**
 * 按照提示模拟汽车网站信息
 * ①定义汽车Auto类
 * 属性:品牌，车长，价格
 * ②定义SUV继承Auto类，包含
 * (1)属性:小型车车长标准值:4295，中型车车长标准值:5070.
 * 定义判断车型方法
 * 2)
 * 判断小型车:小于小型车车长标准值
 * 判断大型车:大于中型车车长标准值
 * 判断中型车:大于小型车车长标准值并且小于等于中型车车长标准值
 * ③测试类中，创建若干SUV对象，保存到集合，遍历集合，输出中型SUV
 * 输出示例如图:
 * 品牌:奔驰
 * 价格:400000.日
 * 车长:4813.0
 */
public class Test
    {
        public static void main(String[] args)
            {
                Suv.setMiddle(5070);
                Suv.setSmall(4295);
                ArrayList<Suv> suvs=new ArrayList<>();
                suvs.add(new Suv("奔驰",4813,400000));
                suvs.add(new Suv("奥迪",4545,458888));
                for (int i = 0; i < suvs.size(); i++)
                    {
                        Suv suv = suvs.get(i);
                        suv.judge();
                    }
            }
    }
