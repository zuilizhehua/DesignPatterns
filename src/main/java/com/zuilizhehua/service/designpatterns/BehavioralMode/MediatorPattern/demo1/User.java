package com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:27
 */
public class User {

    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chatMediator.sendMessage(this, message);
    }

}
