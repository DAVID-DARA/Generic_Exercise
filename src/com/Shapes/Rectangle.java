package com.Shapes;

class Rectangle implements Shape {
    private final String name;
    private final double length;
    private final double width;

    Rectangle(String name, double length,double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}