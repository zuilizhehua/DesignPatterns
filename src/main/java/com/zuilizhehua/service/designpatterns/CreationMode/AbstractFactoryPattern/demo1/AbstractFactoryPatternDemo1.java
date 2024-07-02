package com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1;

import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.impl.MacGUIFactory;
import com.zuilizhehua.service.designpatterns.CreationMode.AbstractFactoryPattern.demo1.impl.WindowsGUIFactory;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:33
 */
public class AbstractFactoryPatternDemo1 {

    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsGUIFactory();
        Button windowsButton = windowsFactory.createButton();
        TextField windowsTextField = windowsFactory.createTextField();

        GUIFactory macFactory = new MacGUIFactory();
        Button macButton = macFactory.createButton();
        TextField macTextField = macFactory.createTextField();

        windowsButton.render(); // 输出：渲染Windows风格的按钮
        windowsTextField.display(); // 输出：显示Windows风格的文本框

        macButton.render(); // 输出：渲染Mac风格的按钮
        macTextField.display(); // 输出：显示Mac风格的文本框
    }

}
