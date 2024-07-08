package com.zuilizhehua.service.designpatterns.BehavioralMode.ObserverPattern.dmeo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:16
 */
public class Subject {

    private int state;
    private List<Observer> observers;

    public Subject() {
        this.state = 0;
        this.observers = new ArrayList<Observer>();
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

}
