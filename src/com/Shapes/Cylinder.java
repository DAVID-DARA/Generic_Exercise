package com.Shapes;

class Cylinder extends Shape {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double getArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

