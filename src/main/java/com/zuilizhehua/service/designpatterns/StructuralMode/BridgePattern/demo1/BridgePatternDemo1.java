package com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1;

import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.impl.Circle;
import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.impl.DrawingAPI1;
import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.impl.DrawingAPI2;
import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.impl.Rectangle;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:53
 */
public class BridgePatternDemo1 {

    public static void main(String[] args) {
        DrawingAPI drawingAPI1 = new DrawingAPI1();
        DrawingAPI drawingAPI2 = new DrawingAPI2();

        Shape circle1 = new Circle(100, 100, 50, drawingAPI1);
        Shape circle2 = new Circle(200, 200, 100, drawingAPI2);

        Shape rectangle1 = new Rectangle(10, 20, 30, 40, drawingAPI1);
        Shape rectangle2 = new Rectangle(50, 60, 70, 80, drawingAPI2);

        circle1.draw();     // 输出：API1 Drawing Circle at (100,100) with radius 50
        circle2.draw();     // 输出：API2 Drawing Circle at (200,200) with radius 100
        rectangle1.draw();  // 输出：API1 Drawing Rectangle from (10,20) to (30,40)
        rectangle2.draw();  // 输出：API2 Drawing Rectangle from (50,60) to (70,80)
    }

}
