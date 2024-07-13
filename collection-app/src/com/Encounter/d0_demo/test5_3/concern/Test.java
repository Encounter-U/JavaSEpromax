package com.Encounter.d0_demo.test5_3.concern;

/**
 * @author Encounter
 * @date 2024/6/26 16:34
 */

/**
 * 社交媒体平台的用户之间的关注关系使用set集合实现，set集合只保存关注的用户名即可。实现以下功能:
 * ①每个用户可以关注其他用户，确保同一个用户不会重复关注
 * ②实现取消关注功能，用户可以选择取消对某个用户的关注,
 * ③实现展示用户关注的人，以便用户可以查看他们的关注关系,
 * ④编写测试方法，测试以上功能
 */
public class Test
    {
        public static void main(String[] args)
            {
                Operator o=new Operator();
                o.concern(new User("路明非"));
                o.concern(new User("路明非"));
                o.concern(new User("楚子航"));
                o.concern(new User("夏弥"));

                o.unfollow("路明非");
                o.unfollow("昂热");

                o.show();
            }
    }
