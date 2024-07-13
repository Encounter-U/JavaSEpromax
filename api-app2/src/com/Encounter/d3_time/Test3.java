package com.Encounter.d3_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Encounter
 * @date 2024/6/21 14:40
 */
public class Test3
    {
        public static void main(String[] args) throws ParseException
            {
                //初始时间
                String start = "2024年10月1日 0:0:0";
                String end = "2024年10月1日 0:10:0";
                String lmf = "2024年10月1日 0:01:38";
                String czh = "2024年10月1日 0:10:38";

                //2.把字符串时间解析为日期对象
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                Date startDt = sdf.parse(start);
                Date endDt = sdf.parse(end);
                Date lmfDt = sdf.parse(lmf);
                Date czhDt = sdf.parse(czh);

                //3.判断是否秒杀成功
                //把日期对象转换为时间毫秒值来判断
                long startTime = startDt.getTime();
                long endTime = endDt.getTime();
                long lmfTime = lmfDt.getTime();
                long czhTime = czhDt.getTime();

                if (lmfTime >= startTime && lmfTime <= endTime)
                    System.out.println("秒杀成功");
                else
                    System.out.println("秒杀失败");

                if (czhTime >= startTime && czhTime <= endTime)
                    System.out.println("秒杀成功");
                else
                    System.out.println("秒杀失败");
            }
    }
