package com.zuilizhehua.service.designpatterns.CreationMode.BuilderPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:33
 */
public class PizzaBuilder {

    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, cheese, pepperoni, bacon);
    }

}
