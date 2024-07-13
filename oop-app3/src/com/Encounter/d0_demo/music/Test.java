package com.Encounter.d0_demo.music;

/**
 * @author Encounter
 * @date 2024/6/20 18:43
 */

/**
 * 设计一个简单的音乐播放器程序。
 * ①使用泛型类 Playlist 来管理播放列表中的音乐。
 * ②每首音乐都有一个名称和一个时长，可以用 Music 类来表示。
 * ③定义两个方法 addMusic 和 play，并分别在 Playlist 类中实现。
 * ④在 Playist 类中，我们定义了一个泛型类型参数 Textends Music，表示T必须是 Music 的子类或本身。我们使用 list 来存储播放列表中的音
 * 乐，并实现了两个方法 addMusic 和 play，分别用于向播放列表中添加音乐和按添加顺序播放音乐。
 * ⑤在测试类中，新建一个 Playlist 对象，并向播放列表中添加三首音乐。然后播放音乐
 */
public class Test
    {
        public static void main(String[] args)
            {
                Playlist<Music> playlist=new Playlist<>();
                playlist.addMusic("Monsters",217);
                playlist.addMusic("Good Time",205);
                playlist.addMusic("可以摆烂咯",157);
                playlist.play();
            }

    }
