package com.learn.pattern.modals;

import com.learn.pattern.interfaces.AdvMediaPlayer;

/**
 * @author Dhruv Maheshwari
 * @version $Id: MP4player.java, v 0.1 2023-03-10 08:34 PM Dhruv Maheshwari Exp $$
 */
public class MP4player implements AdvMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
