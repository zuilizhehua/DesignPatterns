package com.zuilizhehua.service.designpatterns.BehavioralMode.TemplateMethodPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.TemplateMethodPattern.demo1.Game;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/3 9:53
 */
public class FootballGame extends Game {

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}