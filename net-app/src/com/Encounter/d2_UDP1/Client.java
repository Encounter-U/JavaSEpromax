package com.Encounter.d2_UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Encounter
 * @date 2024/07/17 19:19<br/>
 * 目标：完成UDP通信快速入门：实现1发1收
 */
public class Client
    {
        public static void main(String[] args) throws Exception
            {
                //1.创建客户端对象（发送数据包出去）
                DatagramSocket socket = new DatagramSocket();
                //2.创建数据包对象封装要发出去的数据
                        /*
                        public DatagramPacket(byte buf[], int length,
                          InetAddress address, int port)
                          参数一：封装要发出去的数据
                          参数二：发送出去的数据大小（字节个数）
                          参数三：服务端的IP地址（找到服务端主机）
                          参数四：服务端程序的端口
                         */
                byte[] bytes = "路明非是Dragon".getBytes();
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                        InetAddress.getLocalHost(), 6666);
                
                //3.开始正式发送这个数据包出去
                socket.send(packet);
                
                System.out.println("客户端数据发送完毕");
                
                socket.close();//释放资源
                
                
            }
    }
