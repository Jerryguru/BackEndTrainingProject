package com.ar.oops.polymorphisam.runTimePolymorphisam.delevarySystem;

public class MainApp {
     public static void main(String[] args) {
         DeleveryPerson d;
         d=new DeleveryPerson();
         d.deleveryFood();
         d=new Swiggy();
         d.deleveryFood();
         d=new Zomato();
         d.deleveryFood();

    }
}
