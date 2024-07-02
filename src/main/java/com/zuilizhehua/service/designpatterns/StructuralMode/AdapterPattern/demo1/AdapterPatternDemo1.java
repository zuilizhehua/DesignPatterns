package com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo1;

import com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo1.impl.LegacyRectangle;
import com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo1.impl.LegacyRectangleAdapter;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:52
 */
public class AdapterPatternDemo1 {

    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        RectangleNew rectangleAdapter = new LegacyRectangleAdapter(legacyRectangle);
        double area = rectangleAdapter.getArea();
        System.out.println("矩形的面积：" + area);
    }

}
