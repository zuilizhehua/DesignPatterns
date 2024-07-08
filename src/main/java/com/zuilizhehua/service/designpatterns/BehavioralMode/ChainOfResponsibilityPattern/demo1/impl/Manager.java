package com.zuilizhehua.service.designpatterns.BehavioralMode.ChainOfResponsibilityPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.ChainOfResponsibilityPattern.demo1.Approver;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:44
 */
// 经理审批者类
public class Manager extends Approver {
    @Override
    public void approve(double amount) {
        if (amount <= 1000) {
            System.out.println("Manager approved the purchase.");
        } else if (nextApprover != null) {
            nextApprover.approve(amount);
        }
    }
}
