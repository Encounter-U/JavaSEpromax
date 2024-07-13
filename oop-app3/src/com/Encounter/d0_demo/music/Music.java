package com.Encounter.d0_demo.music;

/**
 * @author Encounter
 * @date 2024/6/20 18:08
 */
public  class Music
    {
        private String name;
        private int time;

        public Music(String name, int time)
            {
                this.name = name;
                this.time = time;
            }

        public Music()
            {
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getTime()
            {
                return time;
            }

        public void setTime(int time)
            {
                this.time = time;
            }
    }
