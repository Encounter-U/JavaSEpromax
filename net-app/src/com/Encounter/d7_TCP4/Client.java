package com.Encounter.d7_TCP4;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/07/18 09:27<br/>
 * 目标：完成TCP通信快速入门-客户端开发，实现与多个客户端同时通信
 */
public class Client
    {
        public static void main(String[] args) throws Exception
            {
                //1.创建Socket对象，并同时请求与服务端程序的连接
                Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
                
                //创建一个独立线程，负责随时从socket中获取服务端发送过来的消息
                new ClientReaderThread(socket).start();
                
                //2.从socket通信管道中得到一个字节输出/入流，用来发数据给服务端程序
                OutputStream os = socket.getOutputStream();
                //InputStream is = socket.getInputStream();
                
                //3.把低级的字节输出/入流包装成数据输出/入流
                DataOutputStream dos = new DataOutputStream(os);
                //DataInputStream dis = new DataInputStream(is);
                
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.println("Enter message (enter 0 to exit):");
                        String msg = sc.nextLine();
                        //4.写入数据发送出去
                        dos.writeUTF(msg);
                        dos.flush();//刷新一下
                        
                        if (msg.equals("0"))
                            {
                                System.out.println("The client is exiting...");
                                dos.close();
                                socket.close();//释放资源
                                break;
                            }
                    }
            }
    }
