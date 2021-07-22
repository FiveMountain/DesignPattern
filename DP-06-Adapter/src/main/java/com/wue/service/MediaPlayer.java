package com.wue.service;

/**
 * @author FiveMountain
 * @date 2021/7/21 10:26
 */
public interface MediaPlayer {

    /**
     * 媒体播放器
     * @param audioType audioType
     * @param fileName fileName
     */
    void play(String audioType, String fileName);
}
