package com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.Element;
import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.Visitor;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:52
 */
public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    // 元素A特有的操作
    void operationA() {
        System.out.println("执行元素A的操作");
    }
}