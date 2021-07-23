package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/23 14:20
 */
public class MediatorDemo {
    public static void main(String[] args) {
        User tom = new User("Tom");
        User jerry = new User("Jerry");

        tom.sendMessage("Hi Jerry");
        jerry.sendMessage("Hello Tom");
    }
}
