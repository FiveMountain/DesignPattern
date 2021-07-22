package com.wue;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author FiveMountain
 * @date 2021/7/20 14:15
 */
public class ShapeCache {

    private static Map<String, Shape> shapeMap = new ConcurrentHashMap<>();

    public static Shape getShape(String shapeId) {
        return (Shape) shapeMap.get(shapeId).clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
