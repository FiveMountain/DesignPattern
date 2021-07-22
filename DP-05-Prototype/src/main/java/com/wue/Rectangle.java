package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/20 14:11
 */
public class Rectangle extends Shape{

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
