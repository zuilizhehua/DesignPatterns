package com.zuilizhehua.service.designpatterns.CreationMode.SingletonPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:47
 */
public class Logger {

    private static Logger instance;

    private Logger() {
        // 私有构造方法
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("日志记录：" + message);
    }

}
