package com.zuilizhehua.service.designpatterns.BehavioralMode.ChainOfResponsibilityPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.ChainOfResponsibilityPattern.demo1.Approver;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:44
 */
// 总监审批者类
public class Director extends Approver {
    @Override
    public void approve(double amount) {
        if (amount <= 5000) {
            System.out.println("Director approved the purchase.");
        } else if (nextApprover != null) {
            nextApprover.approve(amount);
        }
    }
}
