package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/20 14:08
 */
public class Circle extends Shape{

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
