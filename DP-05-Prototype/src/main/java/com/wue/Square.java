package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/20 14:11
 */
public class Square extends Shape{

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
