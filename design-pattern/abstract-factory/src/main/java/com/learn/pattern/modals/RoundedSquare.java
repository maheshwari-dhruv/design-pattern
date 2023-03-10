package com.learn.pattern.modals;

import com.learn.pattern.interfaces.Shape;

/**
 * @author Dhruv Maheshwari
 * @version $Id: RoundedSquare.java, v 0.1 2023-02-27 03:58 PM Dhruv Maheshwari Exp $$
 */
public class RoundedSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}