package com.wue.service.impl;

import com.wue.service.Expression;

/**
 * @author FiveMountain
 * @date 2021/7/22 15:58
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
