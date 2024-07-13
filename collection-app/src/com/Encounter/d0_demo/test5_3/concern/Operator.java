package com.Encounter.d0_demo.test5_3.concern;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/26 16:27
 */
public class Operator
    {
        private Set<User> users = new HashSet<>();

        //关注
        public void concern(User user)
            {
                if (!users.contains(user))
                    {
                        users.add(user);
                        System.out.println(user.getName() + "关注成功");
                        return;
                    }
                System.out.println("用户已关注，不可重复关注");
            }

        //取消关注
        public void unfollow(String name)
            {
                for (User user : users)
                    {
                        if (name.equals(user.getName()))
                            {
                                users.remove(user);
                                System.out.println(user.getName() + "已取关");
                                return;
                            }
                    }
                System.out.println("尚未关注该用户");
            }

        //展示关注用户
        public void show()
            {
                if (users.size() <= 0)
                    {
                        System.out.println("还未关注用户");
                        return;
                    }
                System.out.println("已关注用户如下：");
                for (User user : users)
                    {
                        System.out.println(user.getName());
                    }
            }
    }
