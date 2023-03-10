package com.learn.pattern.factory;

import com.learn.pattern.interfaces.Shape;

/**
 * @author Dhruv Maheshwari
 * @version $Id: AbstractFactory.java, v 0.1 2023-02-27 03:59 PM Dhruv Maheshwari Exp $$
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
