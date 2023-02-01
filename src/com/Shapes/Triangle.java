package com.Shapes;

class Triangle implements Shape {
    private String name;
    private double base;
    private double height;

    Triangle(String name, double base, double height) {
        this.name = name;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}