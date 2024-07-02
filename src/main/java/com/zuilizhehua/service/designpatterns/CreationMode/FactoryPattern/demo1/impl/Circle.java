package com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo1.Shape;
import org.springframework.stereotype.Service;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 10:54
 */
@Service
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
