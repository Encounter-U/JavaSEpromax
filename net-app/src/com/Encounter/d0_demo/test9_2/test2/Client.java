package com.Encounter.d0_demo.test9_2.test2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/07/18 10:52<br/>
 * 使用TCP模拟qq收到消息后自动回复功能，按照以下要求完成代码
 * ①创建一个类为客户端，客户端创建对象，使用输出流输出数据，向服务端发送一条消息hello
 * ②创建另一个类为服务端，服务端创建对象，使用输入流接受数据
 * ③服务端使用输出流给出反馈数据(你好，我现在有事不在，请稍后联系)
 * ④)客户端使用输入流接受反馈数据
 */
public class Client
    {
        public static void main(String[] args) throws Exception
            {
                Socket socket = new Socket(InetAddress.getLocalHost(), 6666);
                
                OutputStream os = socket.getOutputStream();//发送
                InputStream is = socket.getInputStream();//接收
                
                //包装
                DataOutputStream dos = new DataOutputStream(os);
                DataInputStream dis = new DataInputStream(is);
                
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        //发送信息
                        System.out.print("Enter the massage (enter \"exit\" to exit):");
                        String sendMsg = sc.nextLine();
                        dos.writeUTF(sendMsg);
                        dos.flush();
                        
                        //退出
                        if (sendMsg.equals("exit"))
                            {
                                System.out.println("客户端正在退出...");
                                dis.close();
                                dos.close();
                                socket.close();
                                break;
                            }
                        
                        //对方忙，接收反馈信息
                        String recMsg = dis.readUTF();
                        System.out.println(socket.getRemoteSocketAddress() + "-->" + recMsg);
                    }
            }
    }
