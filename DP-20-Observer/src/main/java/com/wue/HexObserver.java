package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/23 16:25
 */
public class HexObserver extends Observer{

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
