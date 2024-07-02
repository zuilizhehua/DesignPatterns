package com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1.Coffee;
import com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1.CoffeeDecorator;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 16:56
 */
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "，加牛奶";
    }
}