package com.zuilizhehua.service.designpatterns.BehavioralMode.TemplateMethodPattern.demo1;

/**
 * 游戏抽象类
 * @Author: zhaichunlei
 * @Date: 2024/7/3 9:52
 */
public abstract class Game {
    // 初始化游戏
    public abstract void initialize();

    // 开始游戏
    public abstract void startPlay();

    // 结束游戏
    public abstract void endPlay();

    // 模板方法，定义游戏流程
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}