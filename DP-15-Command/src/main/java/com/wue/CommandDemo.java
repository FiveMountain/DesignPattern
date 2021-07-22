package com.wue;

import com.wue.service.impl.BuyStock;
import com.wue.service.impl.SellStock;

/**
 * @author FiveMountain
 * @date 2021/7/22 14:51
 */
public class CommandDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
