package com.zuilizhehua.service.designpatterns.BehavioralMode.StrategyPattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.StrategyPattern.demo1.impl.AlipayStrategy;
import com.zuilizhehua.service.designpatterns.BehavioralMode.StrategyPattern.demo1.impl.CreditCardPayStrategy;
import com.zuilizhehua.service.designpatterns.BehavioralMode.StrategyPattern.demo1.impl.WeChatPayStrategy;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:32
 */
public class StrategyPatternDemo1 {

    public static void main(String[] args) {
        double amount = 100.0;

        Order order1 = new Order(amount, new AlipayStrategy());
        order1.processPayment();

        Order order2 = new Order(amount, new WeChatPayStrategy());
        order2.processPayment();

        Order order3 = new Order(amount, new CreditCardPayStrategy());
        order3.processPayment();
    }

}
