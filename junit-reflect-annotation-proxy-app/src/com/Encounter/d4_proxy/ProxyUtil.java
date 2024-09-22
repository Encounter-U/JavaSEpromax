package com.Encounter.d4_proxy;

import java.lang.reflect.Proxy;

/**
 * @author Encounter
 * @date 2024/07/19 21:35<br/>
 */
public class ProxyUtil
    {
        public static Star createProxy(BigStar bigStar)
            {
                /**
                 * @CallerSensitive
                 * public static Object newProxyInstance(ClassLoader loader,
                 *                                       Class<?>[] interfaces,
                 *                                       InvocationHandler h)
                 * 参数1：用于指定一个类加载器
                 * 参数2：指定生成的代理长什么样子，即有哪些方法
                 * 参数3：用来指定生成的代理对象要干什么事情
                 */
                //回调方法
                Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                        new Class[]{Star.class}, (proxy, method, args) ->
                            {
                                //代理对象要做的事，会在这里写代码
                                if (method.getName().equals("sing"))
                                    System.out.println("Nova准备工具，通知路明非");
                                else if (method.getName().equals("dance"))
                                    System.out.println("Nova准备场地");
                                return method.invoke(bigStar, args);
                            });
                return starProxy;
            }
    }
