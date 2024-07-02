package com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.Button;
import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.GUIFactory;
import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.TextField;

/**
 * Windows 风格工厂实现
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:31
 */
public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
