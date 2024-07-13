package com.Encounter.d0_demo.test5_3.socializing;

/**
 * @author Encounter
 * @date 2024/6/26 15:55
 */

/**
 * 实现一个简单的社交系统，使用HashSet存储用户的好友列表，并实现以下功能:
 * ① 封装一个用户类，包含用户的ID和用户名等属性
 * ② 提供添加好友的方法，实现在好友列表中添加好友关系
 * ③ 提供删除好友的方法，实现从好友列表中删除好友关系
 * ④ 提供展示用户好友列表的方法，遍历好友列表，输出每个好友的用户名
 * ⑤)提供检查用户是否是好友的方法，实现判断好友列表中是否存在好友关系，并输出结果
 */
public class Test
    {
        public static void main(String[] args)
            {
                Operator o = new Operator();
                o.addFriend(new User(1, "路明非"));
                o.addFriend(new User(1, "路明非"));
                o.addFriend(new User(2, "楚子航"));
                o.addFriend(new User(3, "夏弥"));
                o.addFriend(new User(4, "昂热"));

                o.deleteFriend(1);
                o.deleteFriend(10);

                o.show();

                o.exist(4, "昂热");
                o.exist(3, "凯撒");

            }
    }
