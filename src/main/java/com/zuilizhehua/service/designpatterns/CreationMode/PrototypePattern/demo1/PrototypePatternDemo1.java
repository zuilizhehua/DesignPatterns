package com.zuilizhehua.service.designpatterns.CreationMode.PrototypePattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:13
 */
public class PrototypePatternDemo1 {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape clonedCircle = (Shape) circle.clone();
        clonedCircle.draw(); // 输出：绘制圆形

        Shape rectangle = new Rectangle();
        Shape clonedRectangle = (Shape) rectangle.clone();
        clonedRectangle.draw(); // 输出：绘制矩形
    }

}
