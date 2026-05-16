package com.ar.opps1.encapsulations;

//import com.ar.opps.encapsulations.Bike;

public class MAinBike {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setBikeName("Ducaati");
        b.setBikeModel("PavilionNakedSprot");
        b.setBikeColour("BloodRedColour");
        b.setPrice(7654321);
        b.setBikeModelYear(2022);

        System.out.println(b.getBikeName());
        System.out.println(b.getBikeModel());
        System.out.println(b.getBikeColour());
        System.out.println(b.getPrice());
        System.out.println(b.getBikeModelYear());


        b.bikedetails();
        b.bikedetails2();
        b.bikedetails3();
    }
}
