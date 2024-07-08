package com.zuilizhehua.service.designpatterns.BehavioralMode.InterpreterPattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.InterpreterPattern.demo1.impl.AddExpression;
import com.zuilizhehua.service.designpatterns.BehavioralMode.InterpreterPattern.demo1.impl.MultiplyExpression;
import com.zuilizhehua.service.designpatterns.BehavioralMode.InterpreterPattern.demo1.impl.NumberExpression;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 14:00
 */
public class InterpreterPatternDemo1 {

    public static void main(String[] args) {
        Expression expression = new AddExpression(new NumberExpression(3), new MultiplyExpression(new NumberExpression(4), new NumberExpression(5)));
        int result = expression.interpret();
        System.out.println("表达式计算结果：" + result); // 输出：表达式计算结果：23

    }

}
