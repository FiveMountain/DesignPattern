package com.wue.service.impl;

import com.wue.service.Shape;

/**
 * @author FiveMountain
 * @date 2021/7/21 16:07
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
