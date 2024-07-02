package com.zuilizhehua.service.designpatterns.StructuralMode.CompositePattern.demo1;

import com.zuilizhehua.service.designpatterns.StructuralMode.CompositePattern.demo1.impl.Directory;
import com.zuilizhehua.service.designpatterns.StructuralMode.CompositePattern.demo1.impl.File;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 16:14
 */
public class CompositePatternDemo1 {

    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.txt");

        Directory subDirectory1 = new Directory("Sub Directory 1");
        subDirectory1.addComponent(file1);
        subDirectory1.addComponent(file2);

        Directory subDirectory2 = new Directory("Sub Directory 2");
        subDirectory2.addComponent(file3);

        Directory rootDirectory = new Directory("Root Directory");
        rootDirectory.addComponent(subDirectory1);
        rootDirectory.addComponent(subDirectory2);

        rootDirectory.display();
    }

}
