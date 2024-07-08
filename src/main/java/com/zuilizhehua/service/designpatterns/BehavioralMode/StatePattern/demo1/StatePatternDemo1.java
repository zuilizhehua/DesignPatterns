package com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1.impl.DoorClosedState;
import com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1.impl.DoorOpenedState;
import com.zuilizhehua.service.designpatterns.BehavioralMode.StatePattern.demo1.impl.MovingState;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:13
 */
public class StatePatternDemo1 {

    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        DoorOpenedState openedState = new DoorOpenedState();
        elevator.setState(openedState);
        elevator.openDoor(); // 输出：电梯门打开
        elevator.move(); // 输出：电梯不能移动，先关闭门

        DoorClosedState closedState = new DoorClosedState();
        elevator.setState(closedState);
        elevator.closeDoor(); // 输出：电梯门已关闭
        elevator.move(); // 输出：电梯开始移动
        elevator.openDoor(); // 输出：电梯门已打开
    }

}
