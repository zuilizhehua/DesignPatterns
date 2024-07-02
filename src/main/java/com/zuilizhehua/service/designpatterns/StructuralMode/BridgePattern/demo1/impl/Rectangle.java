package com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.DrawingAPI;
import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.Shape;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:52
 */
public class Rectangle extends Shape {
    private int x1, y1, x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        drawingAPI.drawRectangle(x1, y1, x2, y2);
    }
}