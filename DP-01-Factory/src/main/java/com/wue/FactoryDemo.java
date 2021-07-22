package com.wue;

import com.wue.service.Shape;
import com.wue.util.ShapeFactory;

/**
 * @author FiveMountain
 * @date 2021/7/19 14:51
 */
public class FactoryDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("square");
        square.draw();

    }
}
