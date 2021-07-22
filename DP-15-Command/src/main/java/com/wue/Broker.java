package com.wue;

import com.wue.service.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FiveMountain
 * @date 2021/7/22 14:49
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
