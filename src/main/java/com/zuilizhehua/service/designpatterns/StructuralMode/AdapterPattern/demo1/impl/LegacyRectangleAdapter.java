package com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo1.RectangleNew;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:49
 */
public class LegacyRectangleAdapter implements RectangleNew {

    private LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public double getArea() {
        return legacyRectangle.calculateArea();
    }
}
