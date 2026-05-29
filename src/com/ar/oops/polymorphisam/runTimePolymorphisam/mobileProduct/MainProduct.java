package com.ar.oops.polymorphisam.runTimePolymorphisam.mobileProduct;

public class MainProduct {
     public static void main(String[] args) {
        MobileProduct m = new MobileProduct("Apple",135200,2,"17promax",8);
        m.displayProductDetails();
        m.calculateTotalPrice();
        m.mobileFeatures();
         System.out.println();

        LaptopProduct l = new LaptopProduct("MamckBook",232000 ,2 ,"MakAir 10X","IOS");
        l.displayProductDetails();
        l.calculateTotalPrice();
        l.codingPurpose();
         System.out.println();
    }
}
