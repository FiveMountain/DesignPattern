package com.wue;

import com.wue.service.Color;
import com.wue.service.Shape;
import com.wue.util.AbstractFactory;
import com.wue.util.FactoryProducer;

/**
 * @author FiveMountain
 * @date 2021/7/19 15:38
 */
public class AbsFactoryDemo {
    public static void main(String[] args) {
        // 获取 ShapeFactory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Color red = colorFactory.getColor("Red");
        red.fill();

        Color green = colorFactory.getColor("Green");
        green.fill();

        Color blue = colorFactory.getColor("Blue");
        blue.fill();


    }
}
