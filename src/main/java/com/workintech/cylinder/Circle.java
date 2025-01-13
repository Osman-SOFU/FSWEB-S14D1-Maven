package com.workintech.cylinder;

public class Circle {
    // Instance variable for radius
    private double radius;

    // Constructor
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
