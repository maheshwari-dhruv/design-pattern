package com.learn.pattern.producer;

import com.learn.pattern.factory.AbstractFactory;
import com.learn.pattern.factory.RoundedShapeFactory;
import com.learn.pattern.factory.ShapeFactory;

/**
 * @author Dhruv Maheshwari
 * @version $Id: FactoryProducer.java, v 0.1 2023-02-27 04:01 PM Dhruv Maheshwari Exp $$
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
