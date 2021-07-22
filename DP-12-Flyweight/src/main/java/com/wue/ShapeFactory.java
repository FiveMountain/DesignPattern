package com.wue;

import com.wue.service.Shape;
import com.wue.service.impl.Circle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FiveMountain
 * @date 2021/7/22 9:21
 */
public class ShapeFactory {

    private static final Map<String, Shape> CIRCLE_MAP = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) CIRCLE_MAP.get(color);

        if (circle == null) {
            circle = new Circle(color);
            CIRCLE_MAP.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }

        return circle;
    }
}
