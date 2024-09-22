package com.Encounter.d6_TCP3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/07/18 09:27<br/>
 * 目标：完成TCP通信快速入门-客户端开发，实现1发1收
 */
public class Client
    {
        public static void main(String[] args) throws Exception
            {
                //1.创建Socket对象，并同时请求与服务端程序的连接
                Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
                
                //2.从socket通信管道中得到一个字节输出流，用来发数据给服务端程序
                OutputStream os = socket.getOutputStream();
                
                //3.把低级的字节输出流包装成数据输出流
                DataOutputStream dos = new DataOutputStream(os);
                
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
