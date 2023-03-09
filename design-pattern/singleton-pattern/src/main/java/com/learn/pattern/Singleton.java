package com.learn.pattern;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Singleton.java, v 0.1 2023-03-09 03:36 PM Dhruv Maheshwari Exp $$
 */
public class Singleton {
    // Step 1: Declare a private static variable to hold the single instance of the class.
    private static Singleton instance;

    // Step 2: Declare a private constructor to prevent the creation of additional instances.
    private Singleton() {}

    // Step 3: Define a public static method that returns the single instance of the class, creating it if necessary.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

