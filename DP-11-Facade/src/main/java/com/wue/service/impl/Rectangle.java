package com.wue.service.impl;

import com.wue.service.Shape;

/**
 * @author FiveMountain
 * @date 2021/7/21 16:38
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method.");
    }
}
