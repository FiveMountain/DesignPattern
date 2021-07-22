package com.wue;

import com.wue.service.Image;
import com.wue.service.impl.RealImage;

/**
 * @author FiveMountain
 * @date 2021/7/22 10:48
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
