package com.wue.service.impl;

import com.wue.service.Color;

/**
 * @author FiveMountain
 * @date 2021/7/19 15:37
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
