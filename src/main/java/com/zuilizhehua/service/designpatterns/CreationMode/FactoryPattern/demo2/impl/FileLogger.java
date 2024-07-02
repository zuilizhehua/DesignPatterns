package com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo2.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo2.Logger;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 11:22
 */
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("记录日志到文件：" + message);
    }
}
