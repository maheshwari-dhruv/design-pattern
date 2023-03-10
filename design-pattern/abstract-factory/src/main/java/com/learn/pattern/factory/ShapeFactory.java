package com.learn.pattern.factory;

import com.learn.pattern.interfaces.Shape;
import com.learn.pattern.modals.Rectangle;
import com.learn.pattern.modals.Square;

/**
 * @author Dhruv Maheshwari
 * @version $Id: ShapeFactory.java, v 0.1 2023-02-26 06:39 PM Dhruv Maheshwari Exp $$
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
