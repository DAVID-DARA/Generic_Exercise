package com.Shapes;

abstract class Shape {
    abstract double getArea();
    double getVolume() {
        return Double.NaN;
    }
}