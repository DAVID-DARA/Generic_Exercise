package com.Shapes;

class Sphere implements Shape {
    private String name;
    private double radius;

    Sphere(String name,double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

