package com.zuilizhehua.service.designpatterns.BehavioralMode.CommandPattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.CommandPattern.demo1.impl.LightOffCommand;
import com.zuilizhehua.service.designpatterns.BehavioralMode.CommandPattern.demo1.impl.LightOnCommand;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 10:26
 */
public class CommandPatternDemo1 {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl(lightOnCommand, lightOffCommand);

        remoteControl.pressOnButton();   // 输出：Light is on.
        remoteControl.pressOffButton();  // 输出：Light is off.
    }

}
