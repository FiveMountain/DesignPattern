package com.wue;

import com.wue.service.State;
import com.wue.service.impl.StartState;
import com.wue.service.impl.StopState;

/**
 * @author FiveMountain
 * @date 2021/7/23 16:55
 */
public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
