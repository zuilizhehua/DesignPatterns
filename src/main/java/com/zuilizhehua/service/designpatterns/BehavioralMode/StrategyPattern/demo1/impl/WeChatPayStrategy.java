package com.zuilizhehua.service.designpatterns.BehavioralMode.StrategyPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.StrategyPattern.demo1.PaymentStrategy;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:31
 */
public class WeChatPayStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via WeChat Pay.");
    }
}
