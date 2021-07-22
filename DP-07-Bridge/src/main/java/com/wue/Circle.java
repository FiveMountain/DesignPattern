package com.wue;

import com.wue.service.DrawApi;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:37
 */
public class Circle extends Shape{

    private int radius, x, y;

    public Circle(int radius, int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
