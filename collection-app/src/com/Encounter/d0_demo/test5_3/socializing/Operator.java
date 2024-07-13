package com.Encounter.d0_demo.test5_3.socializing;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/26 15:47
 */
public class Operator
    {
        private Set<User> friends = new HashSet<>();

        //添加好友
        public void addFriend(User user)
            {
                if (!friends.contains(user))
                    {
                        friends.add(user);
                        System.out.println(user.getName() + "添加成功");
                    }
                else
                    System.out.println("好友已存在，添加失败");
            }

        //删除好友
        public void deleteFriend(int id)
            {
                for (User friend : friends)
                    {
                        if (id == friend.getID())
                            {
                                friends.remove(friend);
                                return;
                            }
                    }
                System.out.println("id不存在");
            }

        //展示好友
        public void show()
            {
                for (User friend : friends)
                    {
                        System.out.println("好友姓名：" + friend.getName());
                    }
            }

        //判断某个人是否是好友
        public void exist(int id, String name)
            {
                User user = null;
                for (User friend : friends)
                    {
                        if (name.equals(friend.getName()) && id == friend.getID())
                            {
                                System.out.println("是好友");
                                return;
                            }
                    }
                System.out.println("不是好友");
            }
    }
