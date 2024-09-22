package com.Encounter.d5_proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Encounter
 * @date 2024/07/19 22:18<br/>
 */
public class ProxyUtil
    {
        public static UserService createProxy(UserService userService)
            {
                UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
                        UserServiceImpl.class.getClassLoader(),
                        new Class[]{UserService.class}, new InvocationHandler()
                            {
                                @Override
                                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
                                    {
                                        if (method.getName().equals("login") ||
                                                method.getName().equals("deleteUsers") ||
                                                method.getName().equals("selectUsers"))
                                            {
                                                long startTime = System.currentTimeMillis();
                                                Object invoke = method.invoke(userService, args);
                                                long endTime = System.currentTimeMillis();
                                                System.out.println(method.getName() + " cost time: " + (endTime - startTime) / 1000.0 + "s");
                                                return invoke;
                                            }
                                        else
                                            return method.invoke(userService, args);
                                    }
                            });
                
                return userServiceProxy;
            }
    }
