package com.zuilizhehua.service.designpatterns.BehavioralMode.MementoPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:46
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
