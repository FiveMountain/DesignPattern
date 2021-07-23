package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/23 16:27
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
