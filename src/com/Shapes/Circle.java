package com.Shapes;

class Circle implements Shape
{
    private String name;
    private double radius;

    Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume()
    {
        return 0;
    }
}