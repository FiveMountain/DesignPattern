package com.wue.service.impl;

import com.wue.Stock;
import com.wue.service.Order;

/**
 * @author FiveMountain
 * @date 2021/7/22 14:47
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
