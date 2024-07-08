package com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern.demo1.impl;

import com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern.demo1.ChatMediator;
import com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern.demo1.User;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:29
 */
public class ChatRoom implements ChatMediator {
    @Override
    public void sendMessage(User sender, String message) {
        System.out.println(sender.getName() + " sends message: " + message);
    }
}
