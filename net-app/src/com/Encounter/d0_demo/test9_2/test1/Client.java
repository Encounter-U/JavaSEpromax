package com.Encounter.d0_demo.test9_2.test1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/07/18 10:25<br/>
 * 使用UDP通信模拟短信发送的过程
 * ①创建接收端，模拟短信的接收者，
 * 可以收到来自短信发送者的信息，展示在控制台
 * ②创建客户端，模拟短信的发送者，向接收端发送消息
 */
public class Client
    {
        public static void main(String[] args) throws Exception
            {
                DatagramSocket socket=new DatagramSocket();
                
                Scanner sc=new Scanner(System.in);
                while (true)
                    {
                        System.out.print("Enter the massage (enter \"exit\" to exit):");
                        String msg = sc.nextLine();
                        byte[] buf = msg.getBytes();
                        DatagramPacket packet=new DatagramPacket(buf,buf.length,
                                InetAddress.getLocalHost(),6666);
                        
                        socket.send(packet);
                        if (msg.equals("exit"))
                            {
                                System.out.println("客户端正在退出...");
                                socket.close();
                                break;
                            }
                    }
                
            }
    }
