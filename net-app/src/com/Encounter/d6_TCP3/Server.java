package com.Encounter.d6_TCP3;

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
                
                while (true)
                    {
                        //2.使用ServerSocket对象调用accept()方法，等待客户端连接请求
                        Socket socket = serverSocket.accept();
                        
                        //上线通知
                        System.out.println(socket.getRemoteSocketAddress()+"上线了");
                        
                        //3.把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
                        new ServerReaderThread(socket).start();
                        
                    }
            }
    }
