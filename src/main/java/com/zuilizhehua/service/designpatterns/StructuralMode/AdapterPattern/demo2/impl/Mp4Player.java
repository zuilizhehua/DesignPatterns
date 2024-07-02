package com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2.AdvancedMediaPlayer;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:26
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
