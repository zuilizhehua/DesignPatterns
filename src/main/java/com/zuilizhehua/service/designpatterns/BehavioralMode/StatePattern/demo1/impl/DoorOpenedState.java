package com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1.ElevatorState;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:11
 */
public class DoorOpenedState implements ElevatorState {
    @Override
    public void openDoor() {
        System.out.println("电梯门已打开");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void move() {
        System.out.println("电梯不能移动，先关闭门");
    }
}
