package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/23 15:26
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
