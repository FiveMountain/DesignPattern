package com.wue;

import com.wue.service.DrawApi;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:35
 */
public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * draw
     */
    public abstract void draw();

}
