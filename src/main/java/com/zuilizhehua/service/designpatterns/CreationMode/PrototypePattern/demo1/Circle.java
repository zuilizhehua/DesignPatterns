package com.zuilizhehua.service.designpatterns.CreationMode.PrototypePattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:08
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
