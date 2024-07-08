package com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.Element;
import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.Visitor;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:52
 */
public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    // 元素B特有的操作
    void operationB() {
        System.out.println("执行元素B的操作");
    }
}