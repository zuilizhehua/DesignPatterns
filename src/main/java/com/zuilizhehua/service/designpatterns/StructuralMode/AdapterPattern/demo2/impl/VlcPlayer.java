package com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2.AdvancedMediaPlayer;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:26
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
