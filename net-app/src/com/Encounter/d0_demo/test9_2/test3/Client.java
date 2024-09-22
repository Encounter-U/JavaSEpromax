package com.Encounter.d0_demo.test9_2.test3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/**
 * @author Encounter
 * @date 2024/07/18 11:18<br/>
 * 使用UDP协议的通讯来模拟ping命令的执行效果。按照以下要求设计该程序
 * ①发GK端每隔1秒向接收端发送数据，然后等待接收端进行数据返回
 * ②接收端获取到数据以后，将数据转换成大写进行返回
 * ③如果接收端没有启动，那么此时发送端就无法获取到接收端所发送过来的数据，那么此时提示超时
 * 4)通过调用DatagramSocket中的setSoTimeout设置接收数据的最大等待时间
 * 正常通讯效果图一，不能通讯效果图如图二
 * 我的结果就是需求结果
 */
public class Client
    {
        public static void main(String[] args) throws Exception
            {
                DatagramSocket socket = new DatagramSocket(8888);
                for (int i = 1; i < 6; i++)
                    {
                        try
                            {
                                //发送数据
                                byte[] sendBuf = ("Ping " + i + " " + new Date()).getBytes();
                                DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length, InetAddress.getLocalHost(), 6666);
                                socket.setSoTimeout(1000);//最大等待时间1s
                                socket.send(sendPacket);
                                Thread.sleep(1000);
                                
                                //接收反馈信息
                                byte[] recBuf = new byte[1024 * 64];
                                DatagramPacket recPacket = new DatagramPacket(recBuf, recBuf.length);
                                //socket.setSoTimeout(1000);//最大等待时间2s
                                socket.receive(recPacket);
                                String recMsg = new String(recBuf, 0, recPacket.getLength());
                                System.out.println(recMsg);
                            }
                        catch (Exception e)
                            {
                                //连接超时
                                System.out.println("Ping " + i + " " + new Date() + "   超时   " + socket.getSoTimeout() + "ms");
                            }
                    }
                socket.close();
                System.out.println("=================================================================================================");
            }
    }
