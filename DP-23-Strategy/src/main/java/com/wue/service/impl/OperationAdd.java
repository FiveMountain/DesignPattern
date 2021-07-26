package com.wue.service.impl;

import com.wue.service.Strategy;

/**
 * @author FiveMountain
 * @date 2021/7/26 10:08
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
