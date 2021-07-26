package com.wue;

import com.wue.service.State;

/**
 * @author FiveMountain
 * @date 2021/7/26 8:52
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
