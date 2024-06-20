package com.Encounter.d4_abstract_template_method;

/**
 * @author Encounter
 * @date 2024/6/18 19:53
 */

/**
 * 模板方法设计模式
 */
public abstract class C
    {
        //模板方法，加上final关键字，防止被子类重写
        public final void sing()
            {
                System.out.println("唱一首你喜欢的歌");

                doSing();

                System.out.println("唱完了！");
            }
        public abstract void doSing();
    }
