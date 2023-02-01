package com.Shapes;

class Cylinder implements Shape {
    private String name;
    private double radius;
    private double height;

    Cylinder(String name, double radius, double height) {
        this.name = name;
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

