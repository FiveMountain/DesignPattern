package com.wue.util;

import com.wue.service.Color;
import com.wue.service.Shape;
import com.wue.service.impl.Circle;
import com.wue.service.impl.Rectangle;
import com.wue.service.impl.Square;

/**
 * @author FiveMountain
 * @date 2021/7/19 15:46
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if ("Circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("Square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
