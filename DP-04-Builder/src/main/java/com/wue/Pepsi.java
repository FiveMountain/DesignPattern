package com.wue;

import com.wue.service.impl.ColdDrink;

/**
 * @author FiveMountain
 * @date 2021/7/20 9:42
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 35.0;
    }
}
