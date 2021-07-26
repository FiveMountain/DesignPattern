package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/26 9:44
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean nullable() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in Customer Database";
    }
}
