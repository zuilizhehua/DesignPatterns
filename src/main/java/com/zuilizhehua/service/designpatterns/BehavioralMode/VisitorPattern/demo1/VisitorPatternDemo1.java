package com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.impl.ConcreteVisitor;
import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.impl.ElementA;
import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.impl.ElementB;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:53
 */
public class VisitorPatternDemo1 {

    public static void main(String[] args) {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        Visitor visitor = new ConcreteVisitor();

        elementA.accept(visitor); // 输出：执行元素A的操作
        elementB.accept(visitor); // 输出：执行元素B的操作
    }

}
