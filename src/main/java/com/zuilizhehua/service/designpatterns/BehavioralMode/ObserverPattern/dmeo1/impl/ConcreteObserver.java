package com.zuilizhehua.service.designpatterns.BehavioralMode.ObserverPattern.dmeo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.ObserverPattern.dmeo1.Observer;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 11:27
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println(name + " received update. New state: " + state);
    }
}
