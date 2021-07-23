package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/23 16:18
 */
public abstract class Observer {

    protected Subject subject;

    /**
     * update
     */
    public abstract void update();
}
