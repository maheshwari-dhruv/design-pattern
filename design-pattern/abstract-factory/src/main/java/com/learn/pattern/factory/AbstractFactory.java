package com.learn.pattern.factory;

import com.learn.pattern.interfaces.Shape;

/**
 * @author Kaustubh Dongare
 * @version $Id: AbstractFactory.java, v 0.1 2023-02-27 03:59 PM Kaustubh Dongare Exp $$
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
