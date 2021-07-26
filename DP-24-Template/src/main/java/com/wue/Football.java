package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/26 10:45
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Ender");
    }
}
