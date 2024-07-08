package com.zuilizhehua.service.designpatterns.BehavioralMode.CommandPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 10:26
 */
public class RemoteControl {

    private Command onCommand;
    private Command offCommand;

    public RemoteControl(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOnButton() {
        onCommand.execute();
    }

    public void pressOffButton() {
        offCommand.execute();
    }

}
