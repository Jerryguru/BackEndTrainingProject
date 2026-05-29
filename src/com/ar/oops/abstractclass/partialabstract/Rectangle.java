package com.ar.oops.abstractclass.partialabstract;

public class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(String colour, int length, int breadth) {
        super(colour);
        this.length = length;
        this.breadth = breadth;
    }
//method overriding
    @Override
    double area() {
        return length * breadth;
    }
}
