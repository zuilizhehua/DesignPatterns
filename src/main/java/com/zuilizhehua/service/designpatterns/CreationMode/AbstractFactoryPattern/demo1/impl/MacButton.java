package com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.Button;

/**
 *  Mac 风格按钮实现
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:29
 */
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染Mac风格的按钮");
    }
}
