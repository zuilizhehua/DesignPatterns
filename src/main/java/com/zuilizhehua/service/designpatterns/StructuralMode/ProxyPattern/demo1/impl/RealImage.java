package com.zuilizhehua.service.designpatterns.StructuralMode.ProxyPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.ProxyPattern.demo1.Image;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/3 9:23
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + filename + " from disk.");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
