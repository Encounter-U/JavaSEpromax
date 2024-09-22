package com.Encounter.d8_TCP5;

import java.io.OutputStream;
import java.io.PrintStream;
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
                        //立即响应一个网页内容：“黑马程序员”给浏览器展示
                        OutputStream os = socket.getOutputStream();
                        //打印流更适合写B/S架构
                        PrintStream ps=new PrintStream(os);
                        ps.println("HTTP/1.1 200 OK");
                        ps.println("Content-Type: text/html; charset=UTF-8");
                        ps.println();//必须换行
                        ps.println("<div style='color:blue;font-size:120px;text-align:center'>路明非Dragon</div>");
                        
                        //网页响应完之后直接关闭
                        ps.close();
                        socket.close();
                    }
                catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
                
            }
        
    }