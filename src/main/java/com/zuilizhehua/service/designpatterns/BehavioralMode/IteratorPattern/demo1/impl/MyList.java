package com.zuilizhehua.service.designpatterns.BehavioralMode.IteratorPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.IteratorPattern.demo1.Iterator;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 10:46
 */
public class MyList implements Iterator {
    private String[] data;
    private int index;

    public MyList(String[] data) {
        this.data = data;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return data[index++];
        }
        return null;
    }
}
