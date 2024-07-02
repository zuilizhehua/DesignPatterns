package com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2;

import com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2.impl.AudioPlayer;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:30
 */
public class AdapterPatternDemo2 {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
