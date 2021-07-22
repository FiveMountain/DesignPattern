package com.wue.service.impl;

import com.wue.service.Color;

/**
 * @author FiveMountain
 * @date 2021/7/19 15:36
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
