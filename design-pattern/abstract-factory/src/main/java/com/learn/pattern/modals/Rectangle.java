package com.learn.pattern.modals;

import com.learn.pattern.interfaces.Shape;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Rectangle.java, v 0.1 2023-02-26 06:37 PM Dhruv Maheshwari Exp $$
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
