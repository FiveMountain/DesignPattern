package com.wue.service.impl;

import com.wue.service.Image;

/**
 * @author FiveMountain
 * @date 2021/7/22 10:46
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading: " + fileName);
    }
}
