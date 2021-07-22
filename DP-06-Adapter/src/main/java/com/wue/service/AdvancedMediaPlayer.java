package com.wue.service;

/**
 * @author FiveMountain
 * @date 2021/7/21 10:28
 */
public interface AdvancedMediaPlayer {

    /**
     * play vlc
     * @param fileName fileName
     */
    void playVlc(String fileName);

    /**
     * play mp4
     * @param fileName fileName
     */
    void playMp4(String fileName);
}
