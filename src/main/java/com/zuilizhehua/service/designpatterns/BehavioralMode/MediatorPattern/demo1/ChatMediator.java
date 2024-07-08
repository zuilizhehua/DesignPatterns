package com.zuilizhehua.service.designpatterns.BehavioralMode.MediatorPattern.demo1;

/**
 * 中介者接口
 *
 * @Author: zhaichunlei
 * @Date: 2024/7/8 13:26
 */
public interface ChatMediator {

    void sendMessage(User sender, String message);

}
