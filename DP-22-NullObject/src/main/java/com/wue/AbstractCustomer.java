package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/26 9:41
 */
public abstract class AbstractCustomer {

    protected String name;

    /**
     * nullable
     * @return true / false
     */
    public abstract boolean nullable();

    /**
     * getName
     * @return name
     */
    public abstract String getName();
}
