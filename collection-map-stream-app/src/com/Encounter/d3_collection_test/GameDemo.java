package com.Encounter.d3_collection_test;

/**
 * @author Encounter
 * @date 2024/6/26 18:52
 */

/**
 * 目标：斗地主游戏的案例开发
 * 业务需求分析
 * 业务：共有54张牌
 * 点数："3","4","5","6","7","8","9","10","J","Q","K","A","2"
 * 花色："♠","❤","♣","♦"
 * 大小王："KING","QUEEN"
 * 点数分别要组合4种花色，大小王各一张
 * 斗地主：发出51张牌。剩下三张做为底牌
 */
public class GameDemo
    {
        public static void main(String[] args)
            {
                //初始化牌，创建房间
                Room r = new Room();
                //启动游戏
                r.start();
            }
    }
