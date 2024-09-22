package com.Encounter.d4_proxy;

/**
 * @author Encounter
 * @date 2024/07/19 21:30<br/>
 */
public class BigStar implements Star
    {
        private String name;
        
        public BigStar(String name)
            {
                this.name = name;
            }
        
        @Override
        public String sing(String name)
            {
                System.out.println(this.name + "准备龙化去爆杀" + name);
                return "任务完成";
            }
        
        @Override
        public void dance()
            {
                System.out.println(this.name + "准备庆祝一下");
            }
    }
