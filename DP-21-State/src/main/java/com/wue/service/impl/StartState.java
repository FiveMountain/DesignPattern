package com.wue.service.impl;

import com.wue.Context;
import com.wue.service.State;

/**
 * @author FiveMountain
 * @date 2021/7/26 8:50
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
