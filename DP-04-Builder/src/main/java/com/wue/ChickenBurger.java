package com.wue;

import com.wue.service.impl.Burger;

/**
 * @author FiveMountain
 * @date 2021/7/20 9:41
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 50.5;
    }
}
