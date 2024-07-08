package com.zuilizhehua.service.designpatterns.BehavioralMode.MementoPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:47
 */
public class TextEditor {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getState();
    }

}
