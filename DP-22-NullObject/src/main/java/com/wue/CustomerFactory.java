package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/26 9:45
 */
public class CustomerFactory {

    public static final String[] NAMES = new String[] {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : NAMES) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
