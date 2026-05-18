package com.ar.opps1.encapsulations;

public class Bike {

    private String BikeName;
    private String BikeModel;
    private String BikeColour;
    private double price;
    private int BikeModelYear;

    // Getter Methods

    public String getBikeName() {
        return BikeName;
    }

    public String getBikeModel() {
        return BikeModel;
    }

    public String getBikeColour() {
        return BikeColour;
    }

    public double getPrice() {
        return price;
    }

    public int getBikeModelYear() {
        return BikeModelYear;
    }

    // Setter Methods

    public void setBikeName(String bikeName) {
        BikeName = bikeName;
    }

    public void setBikeModel(String bikeModel) {
        BikeModel = bikeModel;
    }

    public void setBikeColour(String bikeColour) {
        BikeColour = bikeColour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBikeModelYear(int bikeModelYear) {
        BikeModelYear = bikeModelYear;
    }

    // Methods

    public void bikeDetails() {

        System.out.println("Bike Name: " + BikeName);
        System.out.println("Bike Model: " + BikeModel);
        System.out.println("Bike Colour: " + BikeColour);
        System.out.println("Bike Price: " + price);
        System.out.println("Bike Model Year: " + BikeModelYear);
    }
}