package com.workintech.cylinder;

public class Cylinder extends Circle {
    // Instance variable for height
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);  // Call the constructor of Circle class to set the radius
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate the volume of the cylinder
    public double getVolume() {
        return getArea() * height; // Area of base (circle) * height
    }
}
