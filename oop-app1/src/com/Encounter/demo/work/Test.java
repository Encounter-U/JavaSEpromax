package com.Encounter.demo.work;

/**
 * @author Encounter
 * @date 2024/6/18 14:20
 */

/**
 * 1.定义项目经理类Manager 【属性:姓名 工号 工资 奖金】【行为:工作work】
 * 2.定义程序员类Coder【属性:姓名 工号 工资】【行为:工作work】
 * 3.要求:通过有参构造创建两个类的对象，并调用各自的work方法
 * 运行结果:
 * 姓名为:张三,工号为:9527,工资为:10000.0,的程序员正在编写代码
 * 姓名为:李四,工号为:9528,工资为:15000.0,奖金为:2000.0,的项目经理正在管理程序员写代码
 * ##【训练目标】:
 * 能够抽取出正确的继承体系，并解决子类特有属性的初始化问题
 * ##思路分析】:
 * 姓名 工号 工资属性，work行为均为共性内容，是否可以向上抽取?
 * 项目经理类中的奖金属于特有的内容，不应该抽取到父类中，那该定义在哪里?
 * 集合题目和运行结果，重写work方法的时候，里面应该打印属性，子类该通过什么方式获取属性打印?
 * ##【参考步骤】:
 * 将同性行为向上抽取出一个父类，Employee(员工类)
 * 1.
 * 2.编写子类构造方法的时候，通过super访问父类构造方法初始化，单独在项目经理Manager类中定义奖金
 * 属性，其中姓名 工号 工资属性通过父类初始化，奖金属性自己初始化。
 * 重写父类work方法，通过super.getXxx获取属性并拼接打印
 * 创建子类对象，并调用work方法
 */
public class Test
    {
        public static void main(String[] args)
            {
                Coder coder = new Coder("路明非", "0", 50000);
                System.out.println(coder.work());
                Manager manager = new Manager("楚子航", "001", 500000, 5000000);
                System.out.println(manager.work());
            }
    }
