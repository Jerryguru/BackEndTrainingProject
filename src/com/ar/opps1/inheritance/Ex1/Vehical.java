package com.ar.opps1.inheritance.Ex1;

public class Vehical {
   private String make;
    private String colour;
    private int year;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    Vehical(String make , String colour , int year , String model){
        this.make = make;
        this.colour= colour;
        this.year= year;
        this.model= model;

    }
    public void printdetails(){
        System.out.println("Manufacture: "+ make);
        System.out.println("colour of model: "+ colour);
        System.out.println("year of the model: "+year);
        System.out.println("model of the car: "+model);
    }
}
