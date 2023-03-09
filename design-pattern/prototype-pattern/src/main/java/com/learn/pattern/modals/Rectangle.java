package com.learn.pattern.modals;

import com.learn.pattern.abstracts.Shape;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Rectangle.java, v 0.1 2023-03-09 04:10 PM Dhruv Maheshwari Exp $$
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}