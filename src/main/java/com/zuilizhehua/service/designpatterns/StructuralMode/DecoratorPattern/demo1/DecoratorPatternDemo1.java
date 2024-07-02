package com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1;

import com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1.impl.MilkDecorator;
import com.zuilizhehua.service.designpatterns.StructuralMode.DecoratorPattern.demo1.impl.SimpleCoffee;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 16:57
 */
public class DecoratorPatternDemo1 {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("原味咖啡：" + simpleCoffee.getDescription() + "，价格：" + simpleCoffee.getCost() + "元");

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("加牛奶咖啡：" + milkCoffee.getDescription() + "，价格：" + milkCoffee.getCost() + "元");
    }

}
