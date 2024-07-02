package com.zuilizhehua.service.designpatterns.StructuralMode.FlyweightPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.FlyweightPattern.demo1.Player;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 17:27
 */
public class Terrorist implements Player {
    private final String TASK;

    private String weapon;

    public Terrorist() {
        TASK = "Terrorist";
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
