package com.Shapes;

public class Main
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle("Rectangle", 10.0, 5.0);
        Triangle triangle = new Triangle("Triangle", 6.0, 12.0);
        Circle circle = new Circle("Circle", 10.0);
        Cylinder cylinder = new Cylinder("Cylinder", 5.0, 7.0);
        Sphere sphere = new Sphere("Sphere", 12.0);

        Test<Rectangle> rectangleTest = new Test();
        System.out.println("Area of Rectangle: "+rectangleTest.getArea(rectangle));
        System.out.println(rectangleTest.getVolume(rectangle));

        Test<Triangle> triangleTest = new Test();
        System.out.println("Area of Triangle: "+triangleTest.getArea(triangle));
        System.out.println(triangleTest.getVolume(triangle));
    }
}
