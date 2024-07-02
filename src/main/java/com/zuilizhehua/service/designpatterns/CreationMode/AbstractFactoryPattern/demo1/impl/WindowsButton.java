package com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.Button;

/**
 * Windows 风格按钮实现
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:28
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染Windows风格的按钮");
    }
}
