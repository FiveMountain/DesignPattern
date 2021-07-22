package com.wue.service;

/**
 * @author FiveMountain
 * @date 2021/7/20 9:19
 */
public interface Item {

    /**
     * 名
     * @return name
     */
    String name();

    /**
     * packing
     * @return packing
     */
    Packing packing();

    /**
     * 价格
     * @return 价格
     */
    double price();
}
