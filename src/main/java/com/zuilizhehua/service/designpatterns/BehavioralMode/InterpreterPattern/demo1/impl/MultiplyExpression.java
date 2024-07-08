package com.zuilizhehua.service.designpatterns.BehavioralMode.InterpreterPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.InterpreterPattern.demo1.Expression;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:59
 */
public class MultiplyExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public MultiplyExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }
}
