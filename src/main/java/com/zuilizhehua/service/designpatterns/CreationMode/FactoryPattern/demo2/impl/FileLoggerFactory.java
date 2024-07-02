package com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo2.impl;

import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo2.Logger;
import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo2.LoggerFactory;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 11:29
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
