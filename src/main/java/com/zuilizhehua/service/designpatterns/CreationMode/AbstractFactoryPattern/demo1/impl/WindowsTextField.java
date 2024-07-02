package com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.TextField;

/**
 * Windows 风格文本框实现
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:28
 */
public class WindowsTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示Windows风格的文本框");
    }
}
