package com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1.DrawingAPI;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:52
 */
public class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("API1 Drawing Circle at (" + x + "," + y + ") with radius " + radius);
    }

    @Override
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        System.out.println("API1 Drawing Rectangle from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
}