package com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2.impl;

import com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2.AdvancedMediaPlayer;
import com.zuilizhehua.service.designpatterns.StructuralMode.AdapterPattern.demo2.MediaPlayer;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 15:29
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
