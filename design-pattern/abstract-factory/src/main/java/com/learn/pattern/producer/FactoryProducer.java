package com.learn.pattern.producer;

import com.learn.pattern.factory.AbstractFactory;
import com.learn.pattern.factory.RoundedShapeFactory;
import com.learn.pattern.factory.ShapeFactory;

/**
 * @author Kaustubh Dongare
 * @version $Id: FactoryProducer.java, v 0.1 2023-02-27 04:01 PM Kaustubh Dongare Exp $$
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
