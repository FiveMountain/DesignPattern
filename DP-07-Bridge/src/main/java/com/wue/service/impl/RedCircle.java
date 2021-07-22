package com.wue.service.impl;

import com.wue.service.DrawApi;

/**
 * @author FiveMountain
 * @date 2021/7/21 14:31
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
