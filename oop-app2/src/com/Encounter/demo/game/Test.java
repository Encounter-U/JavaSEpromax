package com.Encounter.demo.game;

/**
 * @author Encounter
 * @date 2024/6/18 21:02
 */

/**
 * 有一个游戏设计有以下需求:
 * ① 父类:角色Role 是所有职业的父类(抽象类)，需包含属性:角色的名字(name)
 * 需包含抽象方法:伤害统计方法:publicint attack0):返回值为角色的攻击对敌人的伤害值
 * ②定义Role的两个子类:法师Magician 和战士Soldier
 * 法师Magician需包含属性:魔法等级(magicLevel)
 * 方法:重写父类attack0;返回法师的攻击对敌人造成的伤害值。法师攻击伤害值为:魔法等级*魔法基本伤害值(固定为5)
 * 战士Soldier需包含属性:攻击伤害值(attackPower)
 * 方法:重写父类attack0;返回战士的攻击对敌人造成的伤害值。战士的攻击伤害值为:其攻击伤害属性值
 * ③定义Team类(表示组队):方法:addMember0;增加一个队员(注意:组队成员最多为6人) 提示:利用一个数组属性，保存所有成员
 * 方法:attackSum 0; 表示组队所有成员进行攻击时，对敌人造成的总伤害值
 * ④定义测试类:创建一个Magician对象和一个Soldier对象，以及一个小队Team，将Magician和Soldier对象加入小队，然后调用小队的伤害计
 * 算方法
 */
public class Test
    {
        public static void main(String[] args)
            {
                Role[] roles = new Role[6];
                Team t=new Team(roles);
                t.addMember(new Magician("上杉绘梨衣",100));
                t.addMember(new Soldier("路明非",1000));
                t.attackSum();
            }
    }
