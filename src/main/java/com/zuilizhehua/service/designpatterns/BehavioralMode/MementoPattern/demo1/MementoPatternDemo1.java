package com.zuilizhehua.service.designpatterns.BehavioralMode.MementoPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:47
 */
public class MementoPatternDemo1 {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.setText("Hello, World!");
        Memento memento = textEditor.save();

        textEditor.setText("Goodbye, World!");
        System.out.println("Current text: " + textEditor.getText());

        textEditor.restore(memento);
        System.out.println("Restored text: " + textEditor.getText());
    }

}
