package com.learn.pattern.modals;

import com.learn.pattern.interfaces.AdvMediaPlayer;

/**
 * @author Dhruv Maheshwari
 * @version $Id: VLCplayer.java, v 0.1 2023-03-10 08:34 PM Dhruv Maheshwari Exp $$
 */
public class VLCplayer implements AdvMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
