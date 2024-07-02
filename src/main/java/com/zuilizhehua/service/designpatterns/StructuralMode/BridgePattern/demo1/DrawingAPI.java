package com.zuilizhehua.service.designpatterns.StructuralMode.BridgePattern.demo1;

/**
 * 抽象绘图API
 *
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:47
 */
public interface DrawingAPI {

    void drawCircle(int x, int y, int radius);

    void drawRectangle(int x1, int y1, int x2, int y2);

}
