package com.zuilizhehua.service.designpatterns.StructuralMode.CompositePattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.CompositePattern.demo1.FileSystemComponent;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 16:11
 */
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}
