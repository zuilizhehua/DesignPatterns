package com.zuilizhehua.service.designpatterns.CreationMode.SingletonPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:56
 */
public class SingletonPatternDemo1 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }

}
