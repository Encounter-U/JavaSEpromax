package com.Encounter.d5_resource;

/**
 * @author Encounter
 * @date 2024/7/3 14:41
 */

public class MyConnection implements AutoCloseable
    {
        @Override
        public void close() throws Exception
            {
                System.out.println("释放了与某个硬件的链接资源");
            }
    }
