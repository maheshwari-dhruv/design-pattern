package com.learn.pattern.modals;

import com.learn.pattern.interfaces.Shape;

/**
 * @author Kaustubh Dongare
 * @version $Id: RoundedSquare.java, v 0.1 2023-02-27 03:58 PM Kaustubh Dongare Exp $$
 */
public class RoundedSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}