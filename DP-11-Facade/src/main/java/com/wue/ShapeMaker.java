package com.wue;

import com.wue.service.Shape;
import com.wue.service.impl.Circle;
import com.wue.service.impl.Rectangle;
import com.wue.service.impl.Square;

/**
 * @author FiveMountain
 * @date 2021/7/21 16:40
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
