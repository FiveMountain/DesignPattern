package com.wue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FiveMountain
 * @date 2021/7/23 15:32
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
