package com.wue;

import com.wue.service.impl.GreenCircle;
import com.wue.service.impl.RedCircle;

/**
 * @author FiveMountain
 * @date 2021/7/21 11:22
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(10, 0, 0, new RedCircle());
        Circle greenCircle = new Circle(10, 0, 0, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}
