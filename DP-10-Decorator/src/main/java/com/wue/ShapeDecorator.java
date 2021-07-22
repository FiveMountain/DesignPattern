package com.wue;

import com.wue.service.Shape;

/**
 * @author FiveMountain
 * @date 2021/7/21 16:07
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
