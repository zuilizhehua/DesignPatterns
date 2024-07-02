package com.zuilizhehua.service.designpatterns.StructuralMode.CompositePattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.CompositePattern.demo1.FileSystemComponent;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 16:12
 */
@Data
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<FileSystemComponent>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
}
