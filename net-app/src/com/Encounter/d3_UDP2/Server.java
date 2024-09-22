package com.Encounter.d3_UDP2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Encounter
 * @date 2024/07/17 19:19<br/>
 * 目标：完成UDP通信快速入门-服务端开发
 */
public class Server
    {
        public static void main(String[] args) throws Exception
            {
                //1.创建一个服务端对象（接收数据包）
                DatagramSocket socket = new DatagramSocket(6666);
                System.out.println("Server started");
                
                //2.创建一个数据包对象用于接收数据
                byte[] buffer = new byte[1024 * 64];//64KB 一包数据不会超过64KB
                
                while (true)
                    {
                        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                        
                        //3.开始正式使用数据包来接收客户端发来的数据
                        socket.receive(packet);
                        
                        //4.从字节数组中，把接收到的数据直接打印出来
                        //读取多少就倒出多少
                        //获取本次数据包接收了多少数据
                        int length = packet.getLength();
                        String info = new String(buffer, 0, length);
                        
                        System.out.println(packet.getAddress() + ":" + packet.getPort() + ":" + info);
                                            //客户端地址                 //客户端端口（若未指定则随机分配）
                        
                        if (info.equals("0"))
                            {
                                socket.close();
                                break;
                            }
                    }
            }
    }
