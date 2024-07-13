package com.Encounter.d3_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Encounter
 * @date 2024/6/26 19:03
 */
public class Room
    {
        //必须有一副牌
        private List<Card> allCards = new ArrayList<>();

        public Room()
            {
                //1.做出54张牌，存入到集合allCards
                //a.点数：个数确定了，类型确定
                String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
                //b.花色：个数确定，类型确定
                String[] color = {"♠", "❤", "♣", "♦"};
                //c.遍历点数，再遍历花色
                int size = 0;//每张牌的大小
                for (String number : numbers)
                    {
                        for (String string : color)
                            {
                                allCards.add(new Card(number, string, size));
                            }
                        size++;
                    }
                //d.存入大小王
                allCards.add(new Card("", "QUEEN", ++size));
                allCards.add(new Card("", "KING", ++size));
                System.out.println("新牌：" + allCards);
            }

        //游戏启动
        public void start()
            {
                //洗牌
                Collections.shuffle(allCards);
                System.out.println("洗牌后：" + allCards);

                //发牌，定义三个玩家，用集合即可，set集合不允许重复，大小相同的牌会被消掉
                List<Card> LuMingFei = new ArrayList<>();
                List<Card> ChuZiHang = new ArrayList<>();
                List<Card> XiaMi = new ArrayList<>();

                //正式发牌，一次发出51张，留三张当底牌
                for (int i = 0; i < allCards.size() - 3; i++)
                    {
                        Card card = allCards.get(i);
                        //判定牌发给谁
                        if (i % 3 == 0)
                            LuMingFei.add(card);
                        else if (i % 3 == 1)
                            ChuZiHang.add(card);
                        else
                            XiaMi.add(card);
                    }

                //对三个玩家的牌排序
                LuMingFei.sort((o1, o2) -> o2.getSize() - o1.getSize());
                ChuZiHang.sort((o1, o2) -> o2.getSize() - o1.getSize());
                XiaMi.sort((o1, o2) -> o2.getSize() - o1.getSize());

                //数出三人的牌
                System.out.println("路明非:" + LuMingFei);
                System.out.println("楚子航:" + ChuZiHang);
                System.out.println("夏弥:" + XiaMi);
                //subList:从某个位置开始截取到另一位置为一个新集合
                List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
                System.out.println("底牌:" + lastThreeCards);

                //路明非抢到了地主
                LuMingFei.addAll(lastThreeCards);
                LuMingFei.sort((o1, o2) -> o2.getSize() - o1.getSize());
                System.out.println("路明非抢到了地主：" + LuMingFei);
            }

    }
