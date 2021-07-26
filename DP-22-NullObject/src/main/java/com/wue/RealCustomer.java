package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/26 9:43
 */
public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean nullable() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
