package com.zuilizhehua.service.designpatterns.BehavioralMode.ChainOfResponsibilityPattern.demo1;

/**
 * 抽象审批者类
 *
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:42
 */
public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approve(double amount);
}
