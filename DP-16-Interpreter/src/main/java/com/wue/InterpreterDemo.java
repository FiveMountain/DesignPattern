package com.wue;

import com.wue.service.Expression;
import com.wue.service.impl.AndExpression;
import com.wue.service.impl.OrExpression;
import com.wue.service.impl.TerminalExpression;

/**
 * @author FiveMountain
 * @date 2021/7/22 16:02
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? " + isMarried.interpret("Married Julie"));
    }

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
