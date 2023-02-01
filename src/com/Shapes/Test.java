package com.Shapes;

public class Test<S extends Shape>
{
    public double getArea(S a)
    {
        return  a.getArea();
    }

    public double getVolume(S v)
    {
        return v.getVolume();
    }
}