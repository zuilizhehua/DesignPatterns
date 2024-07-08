package com.zuilizhehua.service.designpatterns.BehavioralMode.StrategyPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:32
 */
public class Order {

    private double amount;
    private PaymentStrategy paymentStrategy;

    public Order(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        paymentStrategy.pay(amount);
    }

}
