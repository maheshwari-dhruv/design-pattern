package com.learn.pattern.factory;

import com.learn.pattern.interfaces.Shape;
import com.learn.pattern.modals.RoundedRectangle;
import com.learn.pattern.modals.RoundedSquare;

/**
 * @author Dhruv Maheshwari
 * @version $Id: RoundedShapeFactory.java, v 0.1 2023-02-27 04:01 PM Dhruv Maheshwari Exp $$
 */
public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
