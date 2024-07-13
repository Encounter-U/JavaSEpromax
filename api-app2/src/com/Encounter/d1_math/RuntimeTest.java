package com.Encounter.d1_math;

/**
 * @author Encounter
 * @date 2024/6/21 11:01
 */

import java.io.IOException;

/**
 * 了解下Runtime的几个常见方法<br/>
 * 1.public static Runtime getRuntime() 返回与当前Java应用程序关联的运行时对象<br/>
 * 2.public void exit(int status) 终止当前运行的虚拟机，该参数用作状态码；按照惯例，非零状态码表示异常终止<br/>
 * 3.public int availableProcessors()<br/>
 * 4.public long totalMemory() 返回Java虚拟机中的内存总量<br/>
 * 5.public long freeMemory() 返回Java虚拟机的可用内存量<br/>
 * 6.public Process exec(String command) 启动某个程序，并返回代表该程序的对象
 */
public class RuntimeTest
    {
        public static void main(String[] args) throws IOException, InterruptedException
            {
                //1.
                Runtime runtime = Runtime.getRuntime();
                System.out.println(runtime);

                //2.
                //runtime.exit(0);

                //3.
                System.out.println(runtime.availableProcessors());

                //4.
                System.out.println(runtime.totalMemory()/1024.0/1024.0);//MB

                //5.
                System.out.println(runtime.freeMemory()/1024.0/1024.0);

                //6.也可以直接填入已添加到环境变量的程序名
                Process p = runtime.exec("E:\\XiaomiCloud\\Desktop\\植物大战僵尸杂交版-防闪退小程序V2.0.exe");
                Thread.sleep(5000);//程序在这停留五秒后再继续执行
                p.destroy();//销毁，关闭程序
            }
    }
