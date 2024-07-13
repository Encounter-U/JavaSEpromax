package com.Encounter.d0_demo.Test2_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringJoiner;

/**
 * @author Encounter
 * @date 2024/6/21 13:02
 */

/**
 * 实现一个掷骰子的小游戏，记录六次投掷的结果，并计算6次结果的平均值，使用ArrayList，存储多个整数。
 * ①使用Math中的random方法生成6个在1~6之间的随机整数，将它们添加到ArrayList中。
 * ②)使用BiqDecimal类中的divide方法计算这些整数的平均值,
 * 3将结果四舍五入到小数点后两位。
 * "生成的随机数为X,X,X，平均值为YYY
 * 4)最后使用StringBuilder将结果输出为如下格式的字符串:
 * 其中，XX,X为生成的随机数列表，YYY为计算出的平均值。
 * 提示:使用StringBuilder的append方法进行字符串拼接，使用Stringloiner将随机数列表转化为字符串，使用BigDecimal的setscale方法设置小
 * 数点位数，使用BigDecimal的divide方法获取平均值。(方法的具体使用自行查看api文档)
 * D:\developljdklbinljava.exe ..
 * 生成的随机数为4,3,2,5,4,6，平均值为4.00
 * 进程已结束，退出代码0
 */
public class Game
    {
        public static void main(String[] args)
            {
                Random r = new Random();
                int sum = 0;
                ArrayList<Integer> nums = new ArrayList<>();
                for (int i = 0; i < 6; i++)
                    {
                        nums.add(r.nextInt(6) + 1);
                        sum += nums.get(i);
                    }
                BigDecimal b1 = BigDecimal.valueOf(sum);
                BigDecimal res = b1.divide(BigDecimal.valueOf(6.0), 2, RoundingMode.HALF_UP);
                StringBuilder sb = new StringBuilder();
                sb.append("生成的随机数为");
                StringJoiner sj = new StringJoiner(",");
                for (int i = 0; i < nums.size(); i++)
                    {
                        sj.add(nums.get(i).toString());
                    }
                sb.append(sj).append(",平均值为").append(res);
                System.out.println(sb);
            }
    }
