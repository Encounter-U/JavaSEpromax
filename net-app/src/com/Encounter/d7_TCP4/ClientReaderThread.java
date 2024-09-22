package com.Encounter.d7_TCP4;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author Encounter
 * @date 2024/07/18 18:33<br/>
 * 目标：完成TCP通信快速入门-客户端开发，实现与多个客户端同时通信
 */
public class ClientReaderThread extends Thread
    {
        private Socket socket;
        
        public ClientReaderThread(Socket socket)
            {
                this.socket = socket;
            }
        
        @Override
        public void run()
            {
                try
                    {
                        InputStream is = socket.getInputStream();
                        DataInputStream dis = new DataInputStream(is);
                        while (true)
                            {
                                try
                                    {
                                        //接收
                                        String msg = dis.readUTF();
                                        System.out.println(socket.getRemoteSocketAddress() + "-->" + msg);
                                    }
                                catch (Exception e)
                                    {
                                        //下线通知
                                        System.out.println(socket.getRemoteSocketAddress() + "-->" + e.getMessage() + "下线了");
                                        Server.onLineSockets.remove(socket);//移除离线客户端
                                        dis.close();
                                        socket.close();
                                        break;
                                    }
                            }
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
            }
    }
