package com.zuilizhehua.service.designpatterns.StructuralMode.ProxyPattern.demo1;

import com.zuilizhehua.service.designpatterns.StructuralMode.ProxyPattern.demo1.impl.ProxyImage;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/3 9:25
 */
public class ProxyPatternDemo1 {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display();  // 输出：Before displaying image1.jpg, do some pre-processing.
        //        Loading image1.jpg from disk.
        //        Displaying image1.jpg
        image2.display();  // 输出：Before displaying image2.jpg, do some pre-processing.
        //        Loading image2.jpg from disk.
        //        Displaying image2.jpg
    }

}
