package com.Shapes;

class Sphere extends Shape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

