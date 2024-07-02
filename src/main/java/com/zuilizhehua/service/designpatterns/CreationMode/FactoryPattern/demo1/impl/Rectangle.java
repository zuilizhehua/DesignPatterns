package com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo1.Shape;
import org.springframework.stereotype.Service;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 10:58
 */
@Service
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}
