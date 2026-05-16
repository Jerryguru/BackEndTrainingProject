package com.ar.opps1.encapsulations;

public class Bike {
    private String BikeName ;
    private String BikeModel ;
    private String BikeColour ;
    private double price ;
    private int BikeModelYear ;

    public String getBikeName() {
        return BikeName;
    }

    public void setBikeName(String bikeName) {
        BikeName = bikeName;
    }

    public String getBikeModel() {
        return BikeModel;
    }

    public void setBikeModel(String bikeModel) {
        BikeModel = bikeModel;
    }

    public String getBikeColour() {
        return BikeColour;
    }

    public void setBikeColour(String bikeColour) {
        BikeColour = bikeColour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBikeModelYear() {
        return BikeModelYear;
    }

    public void setBikeModelYear(int bikeModelYear) {
        BikeModelYear = bikeModelYear;
    }

    public void bikedetails(){
         System.out.println("BikeNAme: "+ BikeName);
         System.out.println("BikeColour: "+ BikeColour);
         System.out.println("BikeModel: "+ BikeModel);
     }
     public void bikedetails2(){
         System.out.println("BikePrice: "+ price);
     }
     public void bikedetails3(){
         System.out.println("BikeModel: " + BikeModel);
     }
}
