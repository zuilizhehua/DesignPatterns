package com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.TextField;

/**
 * Mac 风格文本框实现
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:29
 */
public class MacTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示Mac风格的文本框");
    }
}
