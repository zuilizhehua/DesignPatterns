package com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo2;

import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo2.impl.DatabaseLoggerFactory;
import com.zuilizhehua.service.designpatterns.CreationMode.FactoryPattern.demo2.impl.FileLoggerFactory;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 11:31
 */
public class FactoryPatternDemo2 {

    public static void main(String[] args) {
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.log("这是文件日志记录");

        LoggerFactory databaseLoggerFactory = new DatabaseLoggerFactory();
        Logger databaseLogger = databaseLoggerFactory.createLogger();
        databaseLogger.log("这是数据库日志记录");
    }

}
