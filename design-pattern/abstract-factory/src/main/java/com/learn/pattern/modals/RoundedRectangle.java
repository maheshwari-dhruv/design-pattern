package com.learn.pattern.modals;

import com.learn.pattern.interfaces.Shape;

/**
 * @author Kaustubh Dongare
 * @version $Id: RoundedRectangle.java, v 0.1 2023-02-27 03:57 PM Kaustubh Dongare Exp $$
 */
public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
