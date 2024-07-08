package com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1.impl.DoorClosedState;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:12
 */
public class Elevator {

    private ElevatorState currentState;

    public Elevator() {
        currentState = new DoorClosedState();
    }

    public void setState(ElevatorState state) {
        currentState = state;
    }

    public void openDoor() {
        currentState.openDoor();
    }

    public void closeDoor() {
        currentState.closeDoor();
    }

    public void move() {
        currentState.move();
    }

}
