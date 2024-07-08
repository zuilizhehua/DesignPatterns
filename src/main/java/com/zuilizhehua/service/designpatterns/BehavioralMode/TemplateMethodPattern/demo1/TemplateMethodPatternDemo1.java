package com.zuilizhehua.service.designpatterns.BehavioralMode.TemplateMethodPattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.TemplateMethodPattern.demo1.impl.BasketballGame;
import com.zuilizhehua.service.designpatterns.BehavioralMode.TemplateMethodPattern.demo1.impl.FootballGame;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 10:02
 */
public class TemplateMethodPatternDemo1 {

    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        Game basketballGame = new BasketballGame();

        System.out.println("Football Game:");
        footballGame.play();

        System.out.println("\nBasketball Game:");
        basketballGame.play();
    }

}
