package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/26 10:40
 */
public abstract class Game {
    /**
     * initialize
     */
    abstract void initialize();

    /**
     * startPlay
     */
    abstract void startPlay();

    /**
     * endPlay
     */
    abstract void endPlay();

    public final void play() {

        // initialize
        initialize();

        // start
        startPlay();

        // end
        endPlay();
    }
}
