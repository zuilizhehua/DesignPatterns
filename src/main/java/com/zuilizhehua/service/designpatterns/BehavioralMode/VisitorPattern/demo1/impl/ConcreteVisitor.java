package com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.Visitor;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:53
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitElementA(ElementA elementA) {
        // 实现操作1，处理元素A
        elementA.operationA();
    }

    @Override
    public void visitElementB(ElementB elementB) {
        // 实现操作2，处理元素B
        elementB.operationB();
    }
}