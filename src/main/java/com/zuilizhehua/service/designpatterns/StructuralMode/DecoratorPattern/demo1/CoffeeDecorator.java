package com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1;

import com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1.Coffee;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 16:55
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
