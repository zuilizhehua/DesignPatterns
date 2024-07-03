package com.zuilizhehua.service.designpatterns.StructuralMode.ProxyPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.ProxyPattern.demo1.Image;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/3 9:24
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        beforeDisplay();
        realImage.display();
    }

    private void beforeDisplay() {
        System.out.println("Before displaying " + filename + ", do some pre-processing.");
    }
}