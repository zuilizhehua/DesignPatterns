package com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern;

import com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern.demo1.ChatMediator;
import com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern.demo1.User;
import com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern.demo1.impl.ChatRoom;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:30
 */
public class MediatorPatternDemo1 {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new User("User 1", chatMediator);
        User user2 = new User("User 2", chatMediator);

        user1.sendMessage("Hello!");
        user2.sendMessage("Hi!");
    }

}
