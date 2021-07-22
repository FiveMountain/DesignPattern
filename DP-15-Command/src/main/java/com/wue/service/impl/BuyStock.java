package com.wue.service.impl;

import com.wue.Stock;
import com.wue.service.Order;

/**
 * @author FiveMountain
 * @date 2021/7/22 14:46
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
