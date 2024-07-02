package com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo1;

import org.springframework.stereotype.Service;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 11:05
 */
@Service
public class FactoryPatternDemo1 {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("circle");
        circle.draw(); // 输出：绘制圆形

        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw(); // 输出：绘制矩形
    }

}
