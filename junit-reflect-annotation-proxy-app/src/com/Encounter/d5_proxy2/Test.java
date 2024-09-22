package com.Encounter.d5_proxy2;

import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/07/19 22:17<br/>
 * 目标：使用动态代理解决实际问题，并掌握使用代理的好处
 */
public class Test
    {
        public static void main(String[] args) throws Exception
            {
                //1.创建用户业务对象
                UserService proxy = ProxyUtil.createProxy(new UserServiceImpl());
                
                //2.调用用户业务的功能
                proxy.login("LuMingFei", "Dragon");
                System.out.println("=====================================");
                
                proxy.deleteUsers();
                System.out.println("=====================================");
                
                System.out.println("查询到的用户是：" + Arrays.toString(proxy.selectUsers()));
                System.out.println("=====================================");
            }
    }
