package com.zuilizhehua.service.designpatterns.CreationMode.SingletonPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 13:51
 */
public class Singleton {
    private static Singleton instance;

    // 私有构造函数，防止外部实例化
    private Singleton() {}

    // 全局访问点，获取唯一实例
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 其他实例方法
    public void doSomething() {
        System.out.println("单例");
    }
}
