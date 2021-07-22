package com.wue.util;

import com.wue.service.Color;
import com.wue.service.Shape;

/**
 * @author FiveMountain
 * @date 2021/7/19 15:32
 */
public abstract class AbstractFactory {
    /**
     * 形状工厂
     * @param shapeType 形状参数
     * @return ShapeFactory.getShape()
     */
    public abstract Shape getShape(String shapeType);

    /**
     * 颜色工厂
     * @param colorType 颜色类型
     * @return ColorFactory.getColor()
     */
    public abstract Color getColor(String colorType);
}
