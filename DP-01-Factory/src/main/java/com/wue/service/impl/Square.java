package com.wue.service.impl;

import com.wue.service.Shape;

/**
 * @author FiveMountain
 * @date 2021/7/19 14:34
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
