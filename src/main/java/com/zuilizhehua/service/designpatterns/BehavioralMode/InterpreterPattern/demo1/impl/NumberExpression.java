package com.zuilizhehua.service.designpatterns.BehavioralMode.InterpreterPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.InterpreterPattern.demo1.Expression;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:58
 */
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
