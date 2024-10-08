package com.Encounter.d3_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Encounter
 * @date 2024/7/13 19:23<p/>
 * 目标：掌握LogBack日志框架的使用
 */
public class LogBackTest
    {
        //创建一个Logger日志对象
        public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");

        public static void main(String[] args)
            {
                while (true)
                    {
                        try
                            {
                                LOGGER.info("chu方法开始执行...");
                                chu(10, 0);
                                LOGGER.info("chu方法执行成功...");
                            }
                        catch (Exception e)
                            {
                                //throw new RuntimeException(e);
                                LOGGER.error("chu方法执行失败了，出现了bug...");
                            }
                    }
            }

        public static void chu(int a, int b)
            {
                LOGGER.debug("参数a:" + a);
                LOGGER.debug("参数b:" + b);
                int c = a / b;
                LOGGER.info("结果是：" + c);
            }
    }
