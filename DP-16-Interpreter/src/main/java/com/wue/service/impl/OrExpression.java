package com.wue.service.impl;

import com.wue.service.Expression;

/**
 * @author FiveMountain
 * @date 2021/7/22 15:59
 */
public class OrExpression implements Expression {

    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
