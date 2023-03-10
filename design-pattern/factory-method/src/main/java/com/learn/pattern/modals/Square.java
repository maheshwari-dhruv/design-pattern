package com.learn.pattern.modals;

import com.learn.pattern.interfaces.Shape;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Square.java, v 0.1 2023-02-26 06:37 PM Dhruv Maheshwari Exp $$
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
