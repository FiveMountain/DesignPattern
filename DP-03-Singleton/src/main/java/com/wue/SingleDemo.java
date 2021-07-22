package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/19 16:36
 */
public class SingleDemo {
    public static void main(String[] args) {

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
