package com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.Button;
import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.GUIFactory;
import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.TextField;

/**
 * Mac 风格工厂实现
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:32
 */
public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
}
