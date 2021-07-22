package com.wue.service.impl;

import com.wue.service.AdvancedMediaPlayer;

/**
 * @author FiveMountain
 * @date 2021/7/21 10:29
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
