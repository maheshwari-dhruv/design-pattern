package com.learn.pattern;

import com.learn.pattern.abstracts.Shape;
import com.learn.pattern.cache.ShapeCache;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Main.java, v 0.1 2023-03-09 04:10 PM Dhruv Maheshwari Exp $$
 */
public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType() + " | ID : " + clonedShape1.getId());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType() + " | ID : " + clonedShape2.getId());
    }
}