package com.wue;

import com.wue.service.impl.ColdDrink;

/**
 * @author FiveMountain
 * @date 2021/7/20 9:42
 */
public class Cock extends ColdDrink {
    @Override
    public String name() {
        return "Cock";
    }

    @Override
    public double price() {
        return 30.0;
    }
}
