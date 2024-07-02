package com.zuilizhehua.service.designpatterns.CreationMode.BuilderPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:37
 */
public class BuilderPatternDemo1 {

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.setSize("大")
                .addCheese()
                .addPepperoni()
                .addBacon()
                .build();

        System.out.println("您的披萨：大小-" + pizza.getSize() +
                "，奶酪-" + pizza.isCheese() +
                "，意式辣香肠-" + pizza.isPepperoni() +
                "，培根-" + pizza.isBacon());
    }

}
