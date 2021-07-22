package com.wue;

import com.wue.service.impl.Burger;

/**
 * @author FiveMountain
 * @date 2021/7/20 9:40
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 25.0;
    }
}
