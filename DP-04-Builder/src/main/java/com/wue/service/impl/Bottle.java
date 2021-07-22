package com.wue.service.impl;

import com.wue.service.Packing;

/**
 * @author FiveMountain
 * @date 2021/7/20 9:27
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
