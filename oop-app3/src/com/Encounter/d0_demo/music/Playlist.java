package com.Encounter.d0_demo.music;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/20 18:08
 */
public class Playlist<T extends Music> implements MusicOperator
    {
        private ArrayList<Music> list = new ArrayList<>();

        @Override
        public void addMusic(String name, int time)
            {
                list.add(new Music(name, time));
                System.out.println(name + "保存成功，歌曲时长为"+time+"s");
            }

        @Override
        public void play()
            {
                System.out.println("正在按照添加顺序播放音乐");
                for (int i = 0; i < list.size(); i++)
                    {
                        System.out.println(list.get(i).getName() + "正在播放");
                        System.out.println(list.get(i).getName() + "播放完成，正在准备下一首...");
                    }
            }
    }
