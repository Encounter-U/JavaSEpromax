package com.Encounter.d6_TCP3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author Encounter
 * @date 2024/07/18 16:47<br/>
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
                                    }
                                catch (Exception e)
                                    {
                                        //下线通知
                                        System.out.println(socket.getRemoteSocketAddress() + "-->" + e.getMessage() + "下线了");
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
