package com.wue.service.impl;

import com.wue.service.Item;
import com.wue.service.Packing;

/**
 * @author FiveMountain
 * @date 2021/7/20 9:26
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * price
     * @return price
     */
    @Override
    public abstract double price();
}
