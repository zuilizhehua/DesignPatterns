package com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo1;

import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo1.impl.Circle;
import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo1.impl.Rectangle;
import org.springframework.stereotype.Service;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 11:01
 */
@Service
public class ShapeFactory {

    public Shape createShape(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        return null;
    }

}
