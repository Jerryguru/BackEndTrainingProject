package com.ar.oops.abstractclass.partialabstract;

public  abstract class Shape {
    String colour;

    public Shape(String colour) {
        this.colour = colour;
    }
    //abstract method it has no body no  implimentation here child class must impliment it
    abstract double area();
    void display(){
        System.out.println("Colour of it was "+ colour);
    }
}

