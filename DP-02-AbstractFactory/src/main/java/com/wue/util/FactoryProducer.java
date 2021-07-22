package com.wue.util;

/**
 * @author FiveMountain
 * @date 2021/7/19 15:50
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if ("Shape".equalsIgnoreCase(factoryType)) {
            return new ShapeFactory();
        } else if ("Color".equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        }

        return null;
    }
}
