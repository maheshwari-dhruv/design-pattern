package com.learn.pattern;

/**
 * @author Dhruv Maheshwari
 * @version \$Id: Main.java, v 0.1 2023-03-09 03:35PM Dhruv Maheshwari Exp $$
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // The two objects should be the same instance
        System.out.println(singleton1 == singleton2); // Output: true
    }
}