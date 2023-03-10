package com.learn.pattern;

import com.learn.pattern.factory.AbstractFactory;
import com.learn.pattern.interfaces.Shape;
import com.learn.pattern.producer.FactoryProducer;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Main.java, v 0.1 2023-02-28 11:58 AM Dhruv Maheshwari Exp $$
 */
public class Main {
    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();

        //get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape2.draw();

        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();

        //get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of Shape Square
        shape4.draw();

    }
}