package com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1.ElevatorState;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:11
 */
public class DoorClosedState implements ElevatorState {
    @Override
    public void openDoor() {
        System.out.println("电梯门打开");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门已关闭");
    }

    @Override
    public void move() {
        System.out.println("电梯开始移动");
    }
}
