package com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.DrawingAPI;
import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.Shape;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:49
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}