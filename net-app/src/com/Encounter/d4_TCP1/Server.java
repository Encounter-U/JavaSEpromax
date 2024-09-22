package com.Encounter.d4_TCP1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Encounter
 * @date 2024/07/18 09:27<br/>
 * 目标：完成TCP通信快速入门-客户端开发，实现1发1收
 */
public class Server
    {
        public static void main(String[] args) throws Exception
            {
                System.out.println("Server started");
                //1.创建ServerSocket对象，同时为服务端注册端口
                ServerSocket serverSocket = new ServerSocket(8888);
                
                //2.使用ServerSocket对象调用accept()方法，等待客户端连接请求
                Socket socket = serverSocket.accept();
                
                //3.从socket通信管道中得到一个字节输入流
                InputStream is = socket.getInputStream();
                
                //4.把原始的字节输入流包装成数据输入流
                DataInputStream dis = new DataInputStream(is);
                
                while (true)
                    {
                        try
                            {
                                //5.使用数据输入流读取客户端发送过来的信息
                                String msg = dis.readUTF();//一定要一一对应
                                System.out.println(socket.getRemoteSocketAddress() + "-->" + msg);
                            }
                        catch (Exception e)
                            {
                                System.out.println(socket.getRemoteSocketAddress()+" offline");
                                System.out.println("The server is exiting...");
                                dis.close();
                                socket.close();
                                break;
                            }
                    }
            }
    }
