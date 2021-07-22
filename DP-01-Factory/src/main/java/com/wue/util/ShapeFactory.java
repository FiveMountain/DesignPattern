package com.wue.util;

import com.wue.service.Shape;
import com.wue.service.impl.Circle;
import com.wue.service.impl.Rectangle;
import com.wue.service.impl.Square;

/**
 * @author FiveMountain
 * @date 2021/7/19 14:35
 */
public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }

        return null;
    }
}
