package com.learn.pattern.modals;

import com.learn.pattern.abstracts.Shape;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Circle.java, v 0.1 2023-03-09 04:10 PM Dhruv Maheshwari Exp $$
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
