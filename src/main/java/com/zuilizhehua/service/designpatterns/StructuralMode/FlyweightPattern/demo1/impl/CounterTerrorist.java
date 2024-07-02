package com.zuilizhehua.service.designpatterns.StructuralMode.FlyweightPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.FlyweightPattern.demo1.Player;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 17:28
 */
public class CounterTerrorist implements Player {
    private final String TASK;

    private String weapon;

    public CounterTerrorist() {
        TASK = "CounterTerrorist";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println(TASK + " with weapon " + weapon + " | Performing mission...");
    }
}
