package com.learn.pattern.abstracts;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Shape.java, v 0.1 2023-03-09 04:10 PM Dhruv Maheshwari Exp $$
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void draw();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
