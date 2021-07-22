package com.wue;

import com.wue.service.Shape;
import com.wue.service.impl.Circle;
import com.wue.service.impl.Rectangle;

/**
 * @author FiveMountain
 * @date 2021/7/21 16:12
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border: ");
        circle.draw();

        System.out.println("Circle of red border: ");
        redCircle.draw();

        System.out.println("Rectangle of red border: ");
        redRectangle.draw();
    }
}
