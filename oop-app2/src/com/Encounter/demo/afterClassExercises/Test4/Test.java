package com.Encounter.demo.afterClassExercises.Test4;

/**
 * @author Encounter
 * @date 2024/6/19 15:56
 */

/**
 * 定义人(Person)类人类中有吃饭方法(eat)和工作方法(work)
 * 定义超人(SuperMan)类，超人类中有救人方法(save)并且超人也属于人类。
 * 要求:使用多态的方式创建超人对象，调用吃饭和工作的方法。再将此对象转为超人对象，调用救人的方法。
 * ##训练目标):
 * 能够使用多态的方式创建对象，能完成向下转型，
 * ##【思路分析】:
 * 人类和超人类有什么样的关系?
 * ##【参考步骤
 * 创建人类，人类中定义吃饭方法和工作方法。
 * 创建超人类，继承人类，并定义自己特有的救人方法，
 * 在测试类中，使用父类引用指向子类对象的方式创建对象。
 * 分别调用父类的吃饭方法和工作方法。
 * 将对象向下转型成超人对象。
 * 使用子类对象调用救人方法。
 */
public class Test
    {
        public static void main(String[] args)
            {
                Person man=new SuperMan();
                man.eat();
                man.work();
                ((SuperMan)man).save();
            }
    }

