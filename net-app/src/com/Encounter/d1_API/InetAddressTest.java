package com.Encounter.d1_API;

import java.net.InetAddress;

/**
 * @author Encounter
 * @date 2024/07/17 17:52<br/>
 * 目标：掌握InetAddress类的使用
 */
public class InetAddressTest
    {
        public static void main(String[] args) throws Exception
            {
                //1.获取本机IP地址对象
                InetAddress ip1 = InetAddress.getLocalHost();
                System.out.println(ip1.getHostName());
                System.out.println(ip1.getHostAddress());
                
                //2.获取指定IP或者域名的IP地址对象
                InetAddress ip2 = InetAddress.getByName("www.baidu.com");
                System.out.println(ip2.getHostName());
                System.out.println(ip2.getHostAddress());
                
                //能否联通
                //ping www.baidu.com
                System.out.println(ip2.isReachable(6000));
            }
    }
