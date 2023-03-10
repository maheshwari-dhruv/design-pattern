package com.learn.pattern.modals;

import com.learn.pattern.adapters.MediaAdapter;
import com.learn.pattern.interfaces.MediaPlayer;

/**
 * @author Dhruv Maheshwari
 * @version $Id: AudioPlayer.java, v 0.1 2023-03-10 08:34 PM Dhruv Maheshwari Exp $$
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}