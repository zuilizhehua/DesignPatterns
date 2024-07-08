package com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:51
 */
public interface  Element {

    void accept(Visitor visitor);

}
