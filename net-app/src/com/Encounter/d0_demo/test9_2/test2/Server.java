package com.Encounter.d0_demo.test9_2.test2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Encounter
 * @date 2024/07/18 10:52<br/>
 * 使用TCP模拟qq收到消息后自动回复功能，按照以下要求完成代码
 * ①创建一个类为客户端，客户端创建对象，使用输出流输出数据，向服务端发送一条消息hello
 * ②创建另一个类为服务端，服务端创建对象，使用输入流接受数据
 * ③服务端使用输出流给出反馈数据(你好，我现在有事不在，请稍后联系)
 * ④)客户端使用输入流接受反馈数据
 */
public class Server
    {
        public static void main(String[] args) throws Exception
            {
                Socket socket = new ServerSocket(6666).accept();
                System.out.println("Start the server");
                
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                
                DataInputStream dis = new DataInputStream(is);
                DataOutputStream dos = new DataOutputStream(os);
                
                while (true)
                    {
                        try
                            {
                                String recMsg = dis.readUTF();
                                System.out.println(socket.getRemoteSocketAddress() + "-->" + recMsg);
                                
                                //忙ing，返回给客户端反馈信息
                                dos.writeUTF("你好，我现在有事不在，请稍后联系");
                            }
                        catch (Exception e)
                            {
                                System.out.println(socket.getRemoteSocketAddress() + "已离线");
                                dis.close();
                                dos.close();
                                socket.close();
                                break;
                            }
                    }
            }
    }
