package com.wue;

import com.wue.service.impl.AudioPlayer;

/**
 * @author FiveMountain
 * @date 2021/7/21 10:39
 */
public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "111.mp3");
        player.play("mp4", "111.mp4");
        player.play("vlc", "111.vlc");
        player.play("avi", "111.avi");
    }
}
