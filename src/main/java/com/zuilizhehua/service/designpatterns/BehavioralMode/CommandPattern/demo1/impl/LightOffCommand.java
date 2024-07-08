package com.zuilizhehua.service.designpatterns.BehavioralMode.CommandPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.CommandPattern.demo1.Command;
import com.zuilizhehua.service.designpatterns.BehavioralMode.CommandPattern.demo1.Light;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 10:24
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
