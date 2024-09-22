package com.Encounter.d4_proxy;

/**
 * @author Encounter
 * @date 2024/07/19 21:53<br/>
 */
public class Test
    {
        public static void main(String[] args)
            {
                BigStar star=new BigStar("路明非");
                Star starProxy = ProxyUtil.createProxy(star);
                
                String rs = starProxy.sing("赫尔佐格");
                System.out.println(rs);
                
                starProxy.dance();
            }
    }
