package com.wue.service.impl;

import com.wue.service.Color;

/**
 * @author FiveMountain
 * @date 2021/7/19 15:38
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
