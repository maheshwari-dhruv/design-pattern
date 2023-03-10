package com.learn.pattern.adapters;

import com.learn.pattern.interfaces.AdvMediaPlayer;
import com.learn.pattern.interfaces.MediaPlayer;
import com.learn.pattern.modals.MP4player;
import com.learn.pattern.modals.VLCplayer;

/**
 * @author Dhruv Maheshwari
 * @version $Id: MediaAdapter.java, v 0.1 2023-03-10 08:34 PM Dhruv Maheshwari Exp $$
 */
public class MediaAdapter implements MediaPlayer {

    AdvMediaPlayer advMusicPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advMusicPlayer = new VLCplayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advMusicPlayer = new MP4player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advMusicPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            advMusicPlayer.playMp4(fileName);
        }
    }
}
