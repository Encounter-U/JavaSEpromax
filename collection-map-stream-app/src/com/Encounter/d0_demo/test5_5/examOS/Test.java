package com.Encounter.d0_demo.test5_5.examOS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/28 20:55
 */

/**
 * 编写考试管理系统，使用Map集合存储学生的姓名和对应的分数。实现以下功能
 * ①使用HashMap作为Map的实现类
 * ②添加至少三个学生的姓名和分数信息到Map中。
 * ③使用entrySet0方法遍历Map，输出每个学生的姓名和分数。
 * ④)使用containsKey0)方法检査Map中是否包含指定的学生姓名
 * ⑤使用get0)方法获取指定学生的分数，并输出结果,
 */
public class Test
    {
        public static void main(String[] args)
            {
                Map<String, Integer> exam = new HashMap<>();
                exam.put("路明非", 60);
                exam.put("楚子航", 120);
                exam.put("夏弥",118);

                Set<Map.Entry<String, Integer>> entries = exam.entrySet();
                for (Map.Entry<String, Integer> entry : entries)
                    {
                        System.out.println(entry.getKey() + ":" + entry.getValue());
                    }

                System.out.println(exam.containsKey("路明非"));

                System.out.println(exam.get("路明非"));
            }
    }
