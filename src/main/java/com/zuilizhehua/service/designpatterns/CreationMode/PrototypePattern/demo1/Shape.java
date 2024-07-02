package com.zuilizhehua.service.designpatterns.CreationMode.PrototypePattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:07
 */
abstract class Shape implements Cloneable {
    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}