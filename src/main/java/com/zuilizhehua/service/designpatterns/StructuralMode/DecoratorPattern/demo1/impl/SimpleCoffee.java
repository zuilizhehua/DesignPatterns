package com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1.Coffee;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 16:55
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "普通咖啡";
    }
}
