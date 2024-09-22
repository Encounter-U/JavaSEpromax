package com.Encounter.d0_demo.test9_2.test1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Encounter
 * @date 2024/07/18 10:25<br/>
 * 使用UDP通信模拟短信发送的过程
 * ①创建接收端，模拟短信的接收者，
 * 可以收到来自短信发送者的信息，展示在控制台
 * ②创建客户端，模拟短信的发送者，向接收端发送消息
 */
public class Server
    {
        public static void main(String[] args) throws Exception
            {
                DatagramSocket socket = new DatagramSocket(6666);
                System.out.println("Start the server");
                
                byte[] buf = new byte[1024 * 64];
                while (true)
                    {
                        DatagramPacket packet = new DatagramPacket(buf, buf.length);
                        
                        socket.receive(packet);
                        String msg = new String(buf, 0, packet.getLength());
                        if (msg.equals("exit"))
                            {
                                System.out.println("Server exited");
                                socket.close();
                                break;
                            }
                        System.out.println(packet.getAddress() + ":" + packet.getPort() + "-->" + msg);
                    }
                
            }
    }
