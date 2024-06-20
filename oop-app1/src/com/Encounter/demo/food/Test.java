package com.Encounter.demo.food;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Encounter
 * @date 2024/6/17 20:38
 */

/**
 * 超市从新西兰引进一批牛肉，请定义一个类，有成员属性分别是部位，价格，产地(都是新西兰)，创建一个测试类并完成如下内容:
 * ① 创建对象通过成员方法将肉类信息打印到控制台上。(格式如下)
 * 产自新西兰的上脑==115元/斤
 * 产自新西兰的吊龙==105元/斤
 * ② 在main方法中生成一个1-1000钱随机数(整数、单位:元)，问最多能购买多少斤上脑并输出在控制台上，最多能购买多少斤吊龙开输出在控
 * 制台上。(不足1斤，则舍掉)
 * 最终结果例如:
 * 150元能买1斤上脑
 * 150元能买1斤吊龙
 */
public class Test
    {
        public static void main(String[] args)
            {
                Food.setRegion("新西兰");
                ArrayList<Food> foods = new ArrayList<>();
                foods.add(new Food("上脑", 115));
                foods.add(new Food("吊龙", 105));
                FoodUtil fu = new FoodUtil(foods);
                fu.show();
                Random r = new Random();
                fu.pay(r.nextInt(1000) + 1);
            }
    }
