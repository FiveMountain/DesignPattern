package com.wue;

import com.wue.service.impl.OperationAdd;
import com.wue.service.impl.OperationMultiply;
import com.wue.service.impl.OperationSubtract;

/**
 * @author FiveMountain
 * @date 2021/7/26 10:12
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
