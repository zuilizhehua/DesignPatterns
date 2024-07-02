package com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1;

/**
 * 抽象形状类
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:47
 */
public abstract class Shape {
    protected DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}
