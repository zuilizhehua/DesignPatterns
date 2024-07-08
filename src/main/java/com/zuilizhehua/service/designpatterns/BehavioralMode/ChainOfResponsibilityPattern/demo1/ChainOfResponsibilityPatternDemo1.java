package com.zuilizhehua.service.designpatterns.BehavioralMode.ChainOfResponsibilityPattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.ChainOfResponsibilityPattern.demo1.impl.Director;
import com.zuilizhehua.service.designpatterns.BehavioralMode.ChainOfResponsibilityPattern.demo1.impl.Manager;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:45
 */
public class ChainOfResponsibilityPatternDemo1 {

    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();

        manager.setNextApprover(director);

        double amount1 = 800;
        double amount2 = 3000;
        double amount3 = 7000;

        manager.approve(amount1);
        manager.approve(amount2);
        manager.approve(amount3);
    }

}
