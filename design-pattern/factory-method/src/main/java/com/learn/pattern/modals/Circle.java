package com.learn.pattern.modals;

import com.learn.pattern.interfaces.Shape;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Circle.java, v 0.1 2023-02-26 06:37 PM Dhruv Maheshwari Exp $$
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
