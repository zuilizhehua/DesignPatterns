package com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1;

/**
 * 抽象工厂接口
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:31
 */
public interface GUIFactory {

    Button createButton();
    TextField createTextField();

}
