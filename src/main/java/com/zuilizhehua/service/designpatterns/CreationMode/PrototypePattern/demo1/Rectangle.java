package com.zuilizhehua.service.designpatterns.CreationMode.PrototypePattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:10
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
