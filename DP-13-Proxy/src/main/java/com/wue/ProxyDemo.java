package com.wue;

import com.wue.service.Image;

/**
 * @author FiveMountain
 * @date 2021/7/22 9:58
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");

        image.display();
        System.out.println();
        image.display();
    }
}
