package com.zuilizhehua.service.designpatterns.BehavioralMode.ObserverPattern.dmeo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.ObserverPattern.dmeo1.impl.ConcreteObserver;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:19
 */
public class ObserverPatternDemo1 {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setState(1);
        subject.setState(2);
    }

}
