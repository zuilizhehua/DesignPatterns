package com.zuilizhehua.service.designpatterns.BehavioralMode.TemplateMethodPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.TemplateMethodPattern.demo1.Game;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 10:01
 */
public class BasketballGame extends Game {

    @Override
    public void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Basketball Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}