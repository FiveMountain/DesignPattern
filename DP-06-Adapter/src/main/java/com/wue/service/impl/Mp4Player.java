package com.wue.service.impl;

import com.wue.service.AdvancedMediaPlayer;

/**
 * @author FiveMountain
 * @date 2021/7/21 10:30
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
