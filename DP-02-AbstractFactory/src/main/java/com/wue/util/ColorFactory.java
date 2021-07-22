package com.wue.util;

import com.wue.service.Color;
import com.wue.service.Shape;
import com.wue.service.impl.Blue;
import com.wue.service.impl.Green;
import com.wue.service.impl.Red;

/**
 * @author FiveMountain
 * @date 2021/7/19 15:48
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }

        if ("Red".equalsIgnoreCase(colorType)) {
            return new Red();
        } else if ("Green".equalsIgnoreCase(colorType)) {
            return new Green();
        } else if ("Blue".equalsIgnoreCase(colorType)) {
            return new Blue();
        }

        return null;
    }
}
