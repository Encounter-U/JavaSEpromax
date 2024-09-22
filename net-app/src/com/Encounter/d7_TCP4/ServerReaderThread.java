package com.Encounter.d7_TCP4;

import java.io.*;
import java.net.Socket;

/**
 * @author Encounter
 * @date 2024/07/18 16:47<br/>
 * 目标：完成TCP通信快速入门-客户端开发，实现与多个客户端同时通信
 */
public class ServerReaderThread extends Thread
    {
        private Socket socket;
        
        public ServerReaderThread(Socket socket)
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
                                        String msg = dis.readUTF();
                                        System.out.println(socket.getRemoteSocketAddress() + "-->" + msg);
                                        sendMsgToAll(msg);
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
        
        private void sendMsgToAll(String msg)
            {
                //发送给全部在线的socket管道接收
                for (Socket onLineSocket : Server.onLineSockets)
                    {
                        try
                            {
                                OutputStream os = onLineSocket.getOutputStream();
                                DataOutputStream dos = new DataOutputStream(os);
                                dos.writeUTF(onLineSocket.getRemoteSocketAddress() + "-->" + msg);
                                dos.flush();//记得刷新，避免未发出去
                            }
                        catch (IOException e)
                            {
                                throw new RuntimeException(e);
                            }
                    }
            }
    }
