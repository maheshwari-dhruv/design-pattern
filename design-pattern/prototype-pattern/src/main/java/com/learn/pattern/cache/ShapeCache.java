package com.learn.pattern.cache;

import com.learn.pattern.abstracts.Shape;
import com.learn.pattern.modals.Circle;
import com.learn.pattern.modals.Rectangle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhruv Maheshwari
 * @version $Id: ShapeCache.java, v 0.1 2023-03-09 04:10 PM Dhruv Maheshwari Exp $$
 */
public class ShapeCache {

    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}

