package com.Encounter.d0_demo.test9_2.test3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

/**
 * @author Encounter
 * @date 2024/07/18 11:18<br/>
 */
public class Server
    {
        public static void main(String[] args) throws Exception
            {
                DatagramSocket socket = new DatagramSocket(6666);
                System.out.println("Server started");
                
                byte[] buf = new byte[1024 * 64];
                int i = 1;
                while (i < 6)
                    {
                        //接收发送方的数据
                        DatagramPacket packet = new DatagramPacket(buf, buf.length);
                        
                        socket.receive(packet);
                        String recMsg = new String(buf, 0, packet.getLength());
                        System.out.println(recMsg);
                        
                        //将字符串中字母全部大写并反馈给发送方
                        String sendMsg = (recMsg + "   " + "Ping " + (i++) + " " + new Date() + "  " + socket.getSoTimeout()).toUpperCase() + "ms";
                        byte[] bytes = sendMsg.getBytes();
                        DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, packet.getAddress(), 8888);
                        socket.send(sendPacket);
                    }
                System.out.println("=================================================================================================");
                socket.close();
            }
    }
